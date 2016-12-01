package generics;

public class MyList <T> {
	
	private Element<T> first;
	private Element<T> lastElement;

	public MyList() {
		
	}
	
	public void add (T element){
		//Fall 1 kein Element
		if (first == null){
			first = new Element<>(element);
			lastElement = first;
		}
		
		else if (lastElement.last == null){
			Element<T> tmp = new Element<>(element);
			lastElement = tmp;
			first.next = tmp;
			lastElement.last = first;	// oder lastElement.next = first;
		}
		
		else {
			Element<T> tmp = new Element<>(element);
			lastElement.next = tmp;
			tmp.last = lastElement;
			lastElement = tmp;
		}
	}
	
	public Element<T> getFirst(){
		return first;
	}
	
}
