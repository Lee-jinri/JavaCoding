package �÷���3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashToArrayList {

	public static ArrayList<String> toArrayList(HashMap<String, String>hash){
		ArrayList<String>list = new ArrayList<String>();
		Set<String>set = hash.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			list.add(hash.get(key));
		}
		return list;

	}
	
	public static void main(String[] args) {
		HashMap<String, String>map = new HashMap<String,String>();
		map.put("����", "112");
		map.put("ȭ��", "119");
		map.put("��ȭ��ȣ", "114");
		
		ArrayList<String> list = HashToArrayList.toArrayList(map);
		for(int n=0; n<list.size();n++) 
			System.out.println(list.get(n));
	}
}


