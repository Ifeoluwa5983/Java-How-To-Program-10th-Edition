package exercise721;

public class Turtle {
	private int rowPosition = 0;
	private int colPosition = 0;
	private Direction CardinalPoints = Direction.NORTH;
	PenPosition penPosition = PenPosition.UP;
	
	public Direction getCardinalPoints() {
		return CardinalPoints;
	}

	public void setCardinalPoints(Direction cardinalPoints) {
		CardinalPoints = cardinalPoints;
	}
	private Pen turtlePen;

	public int getrowPosition () {
		return rowPosition;
	}

	public void setrowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getcolPosition() {
		return colPosition;
	}

	public void setcolPosition(int colPosition) {
		this.colPosition = colPosition;
	}

	public Pen getTurtlePen() {
		return turtlePen;
	}

	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}
	public void changePenPosition(PenPosition newPosition) {
		turtlePen.setPositionOfThePen(newPosition);
	}
	public void move(int numberOfSteps) {
		this.rowPosition = numberOfSteps;
	}
	public void turnRight() {
		if(CardinalPoints == Direction.NORTH) {
			CardinalPoints = Direction.EAST;
		}else if(CardinalPoints == Direction.EAST) {
			CardinalPoints = Direction.SOUTH;
		}else if(CardinalPoints == Direction.SOUTH) {
			CardinalPoints = Direction.WEST;
		}else if(CardinalPoints == Direction.WEST) {
			CardinalPoints = Direction.NORTH;
		}
	}
	 public void moveForward(int[][] sketchpad,int spaces) {
	        if (CardinalPoints == Direction.NORTH) {
	            for(int i = 0; i < spaces; i++) {
	                sketchpad[rowPosition][i] = 1;
	            }
	            colPosition = spaces - 1;
	        }
	        else if (CardinalPoints == Direction.EAST) {
	            for (int i = 0; i < spaces; i++) {
	                sketchpad[i][colPosition] = 1;
	            }
	            rowPosition = spaces - 1;
	        }
	        else if (CardinalPoints == Direction.SOUTH) {
	            for (int i = spaces - 1; i >= 0; i--) {
	                sketchpad[rowPosition][i] = 1;
	            }
	            colPosition = colPosition - --spaces;
	        }
	        else if (CardinalPoints == Direction.WEST) {
	            for (int i = spaces - 1; i >= 0; i--) {
	                sketchpad[i][colPosition] = 1;
	            }
	            rowPosition = rowPosition - --spaces;
	        }

	    }

}
