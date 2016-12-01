
package generics;

import java.util.Date;
import java.util.LinkedList;

public class MyListMain {
	
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		LinkedList<Integer> listApi = new LinkedList<>();
		
		int max = 10000000;
		
		long start = new Date().getTime();
		
		for (int i = 0; i < max; i++){
			list.add(i);
		}
		
		long end = new Date().getTime();
		System.out.println("unsere Liste:" + (end-start));
		
		
		
		start = new Date().getTime();
		
		for (int i = 0; i < max; i++){
			listApi.add(i);
		}
		
		end = new Date().getTime();
		System.out.println("LinkendListe:" + (end-start));
		
//		Element<Integer> tmp = list.getFirst();
//		while (tmp != null){
//			System.out.println(tmp.getElement());
//			tmp = tmp.next;
//		}
	}

}
