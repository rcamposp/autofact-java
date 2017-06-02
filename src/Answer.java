
public class Answer {
	private String role;
	private String answer;
	private String email;
	private String timestamp;	
	
	public Answer(String role, String answer, String email, String timestamp) {		
		this.role = role;
		this.answer = answer;
		this.email = email;
		this.timestamp = timestamp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Answer [role=" + role + ", answer=" + answer + ", email=" + email + ", timestamp=" + timestamp + "]";
	}
	
	
}
