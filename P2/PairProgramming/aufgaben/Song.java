package aufgaben;

public class Song implements Comparable<Song> {

	private String songName;
	private int duration;
	
	
	public Song(String songName, int duration) {
		this.songName = songName;
		this.duration = duration;
	}
	
	@Override
	public int compareTo(Song o) {
		if(this.songName.compareTo(o.songName) > 0){
			return 1;
		}
		if(this.songName.compareTo(o.songName) < 0){
			return -1;
		}
		else{
			if (this.duration > o.duration){
				return 1;
			}
			else if (this.duration < o.duration){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	
	public String toString() {
		return songName + ": " + duration;
	}
	
	
}
