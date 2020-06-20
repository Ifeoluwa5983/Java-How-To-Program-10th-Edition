package Exercise219;

public class SalesCommissionCalculator {

	private double itemsSold;
		

	 public SalesCommissionCalculator(double itemsSold){
         this.itemsSold = itemsSold;
      }
	 public void setitemsSold(double itemsSold){
         this.itemsSold = itemsSold;
       }
     public double getitemsSold(){
         return itemsSold;
        }
     public double calculateEarnings(double itemsSold) {
    	 double earnings=(itemsSold/100 * 9) + 200 ;
    	 return earnings;
     }
	}


