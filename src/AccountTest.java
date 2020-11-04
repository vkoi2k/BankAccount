
public class AccountTest {
	public static void main(String[] args) {
		Fee accFee = new Fee(0);
		NickleNDime accNickleNDime = new NickleNDime(0);
		Gambler accGambler = new Gambler(0);

		accFee.deposit(2000);
		accFee.withdraw(500);
		System.out.println("Fee Account:");
		accFee.endMonth();
		System.out.println();

		accNickleNDime.deposit(5000);
		accNickleNDime.withdraw(1000);
		accNickleNDime.withdraw(200);
		System.out.println("NickleNDime Account");
		accNickleNDime.endMonth();
		System.out.println();

		accGambler.deposit(8000);
		accGambler.withdraw(1000);
		accGambler.withdraw(1000);
		accGambler.withdraw(1000);
		System.out.println("Gambler Account");
		accGambler.endMonth();
		System.out.println();
	}
}
