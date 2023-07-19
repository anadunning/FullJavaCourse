package entities;

import entities.enums.Colour;

public class Circle extends Shape {
	
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Colour colour, Double radius) {
		super(colour);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
