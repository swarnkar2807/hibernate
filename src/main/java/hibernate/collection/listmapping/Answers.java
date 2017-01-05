package hibernate.collection.listmapping;

public class Answers {

	private int id;
	private int ansId;
	private String ansString;
	private String posterName;
	
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnsString() {
		return ansString;
	}
	public void setAnsString(String ansString) {
		this.ansString = ansString;
	}
	public String getPosterName() {
		return posterName;
	}
	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Answers [id=" + id + ", ansId=" + ansId + ", ansString=" + ansString + ", posterName=" + posterName
				+ "]";
	}
	
	
	
	
}
