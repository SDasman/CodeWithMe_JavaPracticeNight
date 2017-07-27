class Hi extends Thread
{
	public synchronized void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("Finally Will Always Run");
			}
		}
	}
}

class Hello extends Thread
{
	public synchronized void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) { // MAIN THREAD TO RUN FIRST.
		// TODO Auto-generated method stub

		Hi Doorman1 = new Hi();
		Hello Doorman2 = new Hello();
		
		Doorman1.start();
		Doorman2.start();
	}

}
