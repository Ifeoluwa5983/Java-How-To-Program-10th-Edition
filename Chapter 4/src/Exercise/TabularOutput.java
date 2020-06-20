package Exercise;

public class TabularOutput {

	public static void main(String[] args) {
       
        int count = 1;
        
        System.out.println("Number    10*N      100*N       1000*");
        System.out.println("_____________________________________________");
        
        while (count <= 5){
        	
            System.out.println(count + "         " + count *10 + "         "    + count *100 +"        " +    count*1000);
            count++;
        }
    }

	}


