package practice.dataStructures;

public class Sorts {
	public static void main(String[] args) {
		int[] myArray = {23,-8,65,-45,-25,23};
		
		//Bubble sort algorithm
		for(int i = myArray.length-1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(myArray[j] > myArray[j + 1]) {
					swap(myArray , j ,j + 1);
				}
			}
		}
		for(int k = 0;k < myArray.length;k++) {
			System.out.println(myArray[k]);
		}
		
		//Selection sort algorithm
		for(int i = myArray.length-1;i > 0;i--) {
			int largest = 0;
			for(int j = 0;j <= i;j++) {
				if(myArray[j] > largest) {
					largest = i;
				}
			}
			System.out.println(largest);
			//swap(myArray , i , largest);
		}
		
		for(int k = 0;k < myArray.length;k++) {
			System.out.print(myArray[k]);
		}
	}
	//swap method for swapping indexes of the array
	public static void swap(int[] array,int i,int j) {
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
