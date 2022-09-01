package classandpackage;

public class app {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.acNumber = 111;
		ac.holderName = "Sagar Ghalan";
		ac.balance = 100000f;
		System.out.println("Ac no\tAccount Holders name\tBalance");
//		System.out.println(ac.acNumber+"\t"+ac.holderName+"\t\t"+ac.balance);
		ac.display();
	}
}
