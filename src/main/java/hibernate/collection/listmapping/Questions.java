package hibernate.collection.listmapping;

import java.util.List;

public class Questions {
	private int qId;
	private String qName;
	private List<Answers> answer;
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public List<Answers> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Questions [qId=" + qId + ", qName=" + qName + ", answer=" + answer + ", toString()=" + super.toString()
				+ "]";
	}
	 
	
	
}
