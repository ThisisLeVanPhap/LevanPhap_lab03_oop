package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;
    
    public CompactDisc(int id, String title, String category, float cost,String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.tracks = tracks;
        this.artist = artist;
        this.setLength(getLength());
    }

	public CompactDisc(int id, String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super(id, title, category, cost);
    }

	public String getArtist() {
		return artist;
	}
	
    public void addTrack(Track song) {
        if(tracks.contains(song)) {
            System.out.println(song.getTitle() + " already existed");
        } else {
            tracks.add(song);
        }
    }
    
    public void removeTrack(Track song) {
        if(tracks.contains(song)) {
            tracks.remove(song);
        } else {
            System.out.println(song.getTitle() + " not found");
        }
    }
    
    @Override
    public float getLength() {
        float sum = 0;
        for(Track song : tracks) {
            sum += song.getLength();
        }
        return sum;    	
    }
        
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Total length: " + this.getLength() + " seconds");

        for (Track track : tracks) {
            track.play();
        }
    }
}
