package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
        this.title = title;
        this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Track track = (Track) o;
	    return length == track.length && title.equals(track.title);
	}

}
