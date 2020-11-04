import java.util.Random;

public class Gambler extends Account{
	
	Random rd = new Random();
	
	public Gambler(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		int a = (int) (Math.random()*99);
		if (a < 49) {
			super.withdraw(0);
		}
		else {
			super.withdraw(2 * amount);
		}
	}
	
	@Override
	public void endMonthCharge() {
		
	}
}
