import java.util.concurrent.atomic.*;

//
// Generic greeting class to print a message a specified amount of times.
//
class Greeter extends Thread {
	// Static flag to allow two greets to take turns
	private static AtomicInteger _turn = new AtomicInteger(0);

	private int _tries;
	private String _msg;
	private Boolean _onEven;
	
	public Greeter(String msg, int tries, Boolean onEven)
	{
		this._msg = msg;
		this._tries = tries;
		this._onEven = onEven;
	}
	
	public void run()
	{
		try {
			for(int i = 0; i < this._tries; i++)
			{
				// Spin lock
				while (_turn.get() % 2 == (this._onEven ? 0 : 1)) {
					Thread.sleep(20);	
				}

				// Display the message
				System.out.println(this._msg);
				
				// Signal it's no longer my turn.
				_turn.incrementAndGet();
			}
		}
		catch(InterruptedException e)
		{
			// no-op
		}
	}
}


public class Threading {
	public static void main(String[] args) {
		Greeter hi = new Greeter("Hi", 5, false);
		Greeter hello = new Greeter("Hello", 5, true);
		hi.start();
		hello.start();
	}
}
