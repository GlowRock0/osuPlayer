import java.util.List;

public class Mapper {

	private List<Difficulty> diffs;
	private String name;
		
	public Mapper(List<Difficulty> diffs, String name) {
		this.diffs = diffs;
		this.name = name;
	}

	public List<Difficulty> getDiffs() {
		return diffs;
	}
	public String getMapperName() {
		return name;
	}

	public void setDiffs(List<Difficulty> diffs) {
		this.diffs = diffs;
	}
	public void setMapperName(String name) {
		this.name = name;
	}
}