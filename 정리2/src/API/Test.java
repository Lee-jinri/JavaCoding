package API;
import java.util.Iterator;
import java.util.TreeSet;

public class Test{
   public static void main(String[] args){
	   TreeSet<String> set = new TreeSet<String>();
	   set.add("one");
	   set.add("two");
	   set.add("three");
	   set.add("four");
	   set.add("five");

	   Iterator<String> it = set.iterator();
	   while(it.hasNext()){
		   System.out.print(it.next() +" " );
	   }
   }
}