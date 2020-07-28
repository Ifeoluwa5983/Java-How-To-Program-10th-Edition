package exercise79;
import java.util.Scanner;
public class ElementT {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		    int column;
		    
			int [][] array = new int[2][3];
			int smallest = array[0][0];
			
			System.out.println(array[0][0]);
			System.out.println(array[0][1]);;
			System.out.println(array[0][2]);;
			
			System.out.println(array[0][1]);
			System.out.println(array[1][1]);
			
			//int ass = array[0][1] = 0;
			
			//array = {{0,0,0},{0,0,0}};
			
			for(int row = 0;row < array.length;row++) {
				for(column = 0;column < array[row].length;column ++) {
					System.out.print(array[row][column]);
				}
				System.out.println();
			}
			
			for(int row = 0;row < array.length;row++) {
				for(column = 0;column < array[row].length;column++) {
					System.out.println("Enter number");
					array[row][column] = input.nextInt();
					
					if (input.nextInt() > smallest) {
						smallest = input.nextInt();
					}
				}
			}
			for(int row = 0;row < array.length;row++) {
				for(column = 0;column < array[row].length;column++) {
					System.out.print(array[row][column]);
				}
				System.out.println();
			}
			
			for(int i = 0;i > smallest;i++) {
				smallest++;
				System.out.println(smallest);
			}

	}

}
