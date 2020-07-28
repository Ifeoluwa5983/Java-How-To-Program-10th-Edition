package exercise722;

public class KnightsTour {
		
		private int[][]array = new int[8][8];
		private int currentRow;
		private int currentColumn;
		int counter = 2;
		
		public KnightsTour() {
			array[0][0] = 1;
		}
		
		public void moveKnight() {
			for(int row = 0;row < array.length;row++) {
				for(int column = 0;column < array[row].length;column++) {
					System.out.print(array[row][column]+ "  ");
				}
				System.out.println();
			}
		}
		public boolean knightMove(int[] horizontal,int[]vertical) {
			for(int moveNumber = 0;moveNumber < 8;moveNumber++) {
				currentColumn = currentColumn + horizontal[moveNumber];
				currentRow = currentRow + vertical[moveNumber];
				if(validate() && checkForNull()) {
					array[currentRow][currentColumn] = counter;
					counter++;
				}
				else {
					return false;

				}
				
			}
			return false;
			
					}
		public boolean validate() {
			if(currentColumn >= 0 && currentColumn <= 7 && currentRow >= 0 && currentRow <= 7) {
			    return true;
		}
			return false;
		}
		
		public boolean checkForNull() {
			if(array[currentRow][currentColumn] == 0) {
				return true;
			}
			return false;
		}

	}


