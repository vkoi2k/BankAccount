
public class Fee extends Account{

	public Fee(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void endMonthCharge() {
		// TODO Auto-generated method stub
		setBalance(getBalance() - 5);
		if (getBalance() < 0) {
			setBalance(0);
		}
	}
}
