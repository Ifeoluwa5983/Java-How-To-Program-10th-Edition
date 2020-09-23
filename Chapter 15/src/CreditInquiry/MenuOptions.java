package CreditInquiry;

public enum MenuOptions {
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	ZERO(4);
	
	private final int value;
	
	private MenuOptions(int value) {
		this.value = value;
	}

}
