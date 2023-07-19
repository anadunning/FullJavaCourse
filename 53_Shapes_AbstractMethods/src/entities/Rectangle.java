package entities;

import entities.enums.Colour;

public class Rectangle extends Shape {
	
	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Colour colour, Double width, Double height) {
		super(colour);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
