import java.util.List;

public class Song {

	private String songName;
	private String artist;
	private Mapper mapper;
	private List<Difficulty> diffs;
		
	public Song(String songName, String artist, Mapper mapper, List<Difficulty> diffs) {
		this.songName = songName;
		this.artist = artist;
		this.mapper = mapper;
		this.diffs = diffs;
	}

	public String getSongName() {
		return songName;
	}
	public String getArtist() {
		return artist;
	}
	public Mapper getMapper() {
		return mapper;
	}
	public List<Difficulty> getDiffs() {
		return diffs;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}
	public void setDiffs(List<Difficulty> diffs) {
		this.diffs = diffs;
	}
}