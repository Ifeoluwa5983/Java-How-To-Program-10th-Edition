package com.chapter10;

public class PieceWorker extends Employee {
	
	private double wage;
	private int piece;
	
	public PieceWorker(double wage, int piece) {
		this.wage = wage;
		this.piece = piece;
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getPiece() {
		return piece;
	}

	public void setPiece(int piece) {
		this.piece = piece;
	}
	
	public double getPayment() {
		return wage * piece;
	}
}
