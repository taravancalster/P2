package aufgaben;

import java.util.ArrayList;
import java.util.Collections;

public class MySongList {

	
	public static void main(String[] args) {
		ArrayList<Song> songs = new ArrayList<>();
		songs.add(new Song("Song Bla", 220));
		songs.add(new Song("Atemlos", 150));
		songs.add(new Song("Au Revoir", 330));
		songs.add(new Song("Song Bla", 230));
		
		
		for (Song s : songs){
			System.out.println(s);
		}
		
		Collections.sort(songs);
		
		
		for (Song s : songs){
			System.out.println(s);
		}
	}

}
