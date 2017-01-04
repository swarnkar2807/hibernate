package hibernate.collection.listmapping;

import java.util.List;

public class QuestionList {
	private int qId;
	private String qName;
	private List<String> answer;
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
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qName=" + qName + ", answer=" + answer + ", toString()=" + super.toString()
				+ "]";
	}
	 
	
	
}
