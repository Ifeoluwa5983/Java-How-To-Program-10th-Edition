package payRollModification;

public class CommissionCompensationModel extends CompensationModel {
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionCompensationModel(double grossSales,double commissionRate) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double getEarnings() {
		return grossSales * commissionRate;
	}

	
}
