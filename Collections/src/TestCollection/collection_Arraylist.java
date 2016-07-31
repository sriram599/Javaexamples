package TestCollection;
// adding comment from github
import java.util.ArrayList;
import java.util.Iterator;

public class collection_Arraylist {
	
public static void main(String[] args){
	
	ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sriarm");
		al.add("Srikanth");
		al.add("Srividya");
		
		System.out.println(al);
		
		for ( String str:al)
		{
			System.out.println("Welcome " + str);
			
		}
	
		al.remove("Sriram");
		
		al.add(3,"Padma");
		System.out.println(al);
		
		Iterator it = al.iterator();
		
		it.next();
		
}
}
