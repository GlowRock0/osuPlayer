public class Difficulty {

	private String diffName;
	private Song song;
	private Mapper mapper;
		
	public Difficulty(String diffName, Song song, Mapper mapper) {
		this.diffName = diffName;
		this.song = song;
		this.mapper = mapper;
	}
}