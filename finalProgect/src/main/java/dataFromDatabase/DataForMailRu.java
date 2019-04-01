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

//pattern Builder 
	public static class Builder {
		private DataForMailRu newData;

		public Builder() {
			newData = new DataForMailRu();
		}

		public Builder witLogin(String login) {
			newData.login = login;
			return this;
		}

		public Builder withPassword(String password) {
			newData.password = password;
			return this;
		}

		public Builder withFirstEmail(String firstEmail) {
			newData.firstEmail = firstEmail;
			return this;
		}

		public Builder withSecondEmail(String secondEmail) {
			newData.secondEmail = secondEmail;
			return this;
		}

		public DataForMailRu build() {
			return newData;
		}
	}
}
