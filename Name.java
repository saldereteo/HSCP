package semExamPractice;

public class Name {
	private String first = "";
	private String last = "";

	public Name() {
		
	}
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public void setFirst(String first) {
		this.first = first;
		this.last = last;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
}
