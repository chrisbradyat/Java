package at.bradatsch.android.olivia;

public class Login {

	private String username;
	private String userpassword;

	// Constructor
	public Login() {
	}

	public Login(String password) {
		this.username = null;
		this.userpassword = password;

	}

	public Login(String name, String password) {

		this.username = name;
		this.userpassword = password;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	// Save Password

	public void Save() {

		StrongAES a = new StrongAES();
		

		System.out.println("Saving...: " + a.run(this.userpassword, true));

	}

	public void Load() {

		StrongAES a = new StrongAES();

		System.out.println("Loading...: " + a.run(this.userpassword, false));

	}

	public boolean login(String pass) {
		return login(null, pass);

	}

	public boolean login(String user, String pass) {
		String password = this.username + this.userpassword;
		String login = user + pass;

		if (login.equals(password)) {

			return true;
		}
		return false;

	}

}

