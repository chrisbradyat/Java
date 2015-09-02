package at.bradatsch.android.olivia;

public class Main {

	public static void main(String[] args) {
		
		
		Login Olivia = new Login("1293");
		System.out.println("Olivia: " + Olivia.login("1293"));

		Olivia.Save();
		Olivia.Load();
		
	   StrongAES a = new StrongAES();
	   a.run("hi", true);
	   System.out.println(a.getValuecrypt());
	   

	}

}
