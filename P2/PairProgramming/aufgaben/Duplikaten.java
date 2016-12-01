package aufgaben;

import java.util.HashSet;
import java.util.Scanner;

public class Duplikaten {
	
	private Scanner scanner = new Scanner(System.in);
	
	private HashSet<Integer> set = new HashSet<Integer>();
	
	private int number;
	
	private boolean isRunning = true;
	
	public Duplikaten() {
		
		while (isRunning == true){
		
		System.out.println("Gib eine Zahl ein");
		number = scanner.nextInt();
			if (number == -1){
				System.out.println("Ende");
				isRunning=false;
			}
			else if (set.contains(number)){
				System.out.println("Ist schon vorhanden");
			}
			else if (number < -1 ){
				System.out.println("Nö");
			}
			else {
				set.add(number);
				System.out.println(number);
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Duplikaten();
	}
	

}
