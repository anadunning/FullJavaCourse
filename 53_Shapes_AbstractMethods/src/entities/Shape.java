package entities;

import entities.enums.Colour;

public abstract class Shape {
	
	private Colour colour;
	
	public Shape() {
	}
	
	public Shape(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	public abstract double area();

}
