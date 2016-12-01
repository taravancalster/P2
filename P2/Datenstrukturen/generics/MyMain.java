package generics;

import java.util.ArrayList;

public class MyMain {
	
	public static void main(String[] args) {
															//ArrayList<Integer>list = new ArrayList<>();
		
		Element<Integer> t = new Element<>(3);
		
		Element<Integer> next = new Element<>(4);
															//		t.setElement(3);
		t.next = next;
															//		t.nextInt = 7; -> das ist Quatsch
															//		t.next. -> so könnten wir uns auch zB das last Element ausgeben lassen 
															//		t.nextInt. -> so könnten wir uns NICHT das last Element ausgeben lassen, nur der aktuelle wert von nextInt
															//t.next.last = t;	
		next.last = t;	// ist genau das gleiche wie: t.next.last = t;
		
		System.out.println(t.getElement());
	}
		
}
