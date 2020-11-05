public class Gambler extends Account{
	
	public Gambler(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		int a = (int) (Math.random()*100)+1;
		if (a <= 49) {
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
