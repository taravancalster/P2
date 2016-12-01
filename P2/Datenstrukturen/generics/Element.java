package generics;

public class Element <T> {	//<> hiermit definieren wir das es generisch ist

private T element;		
		
		public Element<T> next;
		public T nextInt;
		public T lastInt;
		public Element<T> last;
		
		public Element(T element) {
			this.element = element;
		}
		
		public void setElement(T element) {
			this.element = element;
		}
		
		public T getElement() {
			return element;
		}
}
