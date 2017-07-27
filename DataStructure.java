import java.util.ArrayList;
import java.util.Iterator;

public class DataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] a1 = new int[3];
//		a1[0] = 4;
//		a1[1] = 5;
//		a1[2] = 6;
//		
//		for(int i =0; i< a1.length; i++){
//			System.out.println(a1[i]);
//		}
		
		ArrayList<String> arrayList1= new ArrayList<>(); 
		arrayList1.add("Hello");
		arrayList1.add("Howdy");
		arrayList1.add("Hi");
		Iterator i = arrayList1.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
		for(String s: arrayList1){
			System.out.println(s);
		}
			
	}

}
