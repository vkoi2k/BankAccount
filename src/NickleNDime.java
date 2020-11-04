
public class NickleNDime extends Account{
	
	private int withdrawCount;
	
	public NickleNDime(double balance) {
		super(balance);
		this.withdrawCount = 0;
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() > amount) {
			this.withdrawCount++;
			super.withdraw(amount);
		}
	}

	@Override
	public void endMonthCharge() {
		setBalance(getBalance() - (this.withdrawCount *= 0.5));
	}
	
	public int getWithdrawCount() {
		return withdrawCount;
	}

	public void setWithdrawCount(int withdrawCount) {
		this.withdrawCount = withdrawCount;
	}
	
}
