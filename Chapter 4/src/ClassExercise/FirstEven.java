package ClassExercise;

public class FirstEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int sum = 0;
	
		
		while(counter <= 20 ) {
			sum = sum + counter;
		
			System.out.println(counter);
			counter = counter + 2;
		}
        System.out.println(sum);
	}

}
