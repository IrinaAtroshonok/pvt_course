package dataFromDatabase;

public class DataForMailRu {

	public String login;
	public String password;
	public String firstEmail;
	public String secondEmail;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstEmail() {
		return firstEmail;
	}
	public void setFirstEmail(String firstEmail) {
		this.firstEmail = firstEmail;
	}
	public String getSecondEmail() {
		return secondEmail;
	}
	public void setSecondEmail(String secondEmail) {
		this.secondEmail = secondEmail;
	}
	@Override
	public String toString() {
		return "DataForMailRu: login=" + this.login + ", password=" + this.password + ", firstEmail=" + this.firstEmail
				+ ", secondEmail=" + this.secondEmail;
	}
	
}
