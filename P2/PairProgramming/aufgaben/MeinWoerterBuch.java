package aufgaben;

import java.util.HashMap;
import java.util.Scanner;

public class MeinWoerterBuch {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		String wort = scan.next();
		
		
		while (!wort.equals("Ende")){
			
			if (map.containsKey(wort)){
				map.put(wort, map.get(wort) + 1); //Mit map.get(wort) bekommen wir die Anzahl von Wort
			}else{
				map.put(wort, 1);
			}
			
			wort= scan.next();
		}
		
		for (String key : map.keySet()){ //hole mir alle Keys und diese werden in einer Map gespeischert
			System.out.println(key + ": " + map.get(key));
		
		}

	}
}
