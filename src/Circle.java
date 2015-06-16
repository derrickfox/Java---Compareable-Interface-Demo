/* Derrick Fox
 * CS 213 31015
 * Comparable Interface
 * April 28, 2014
 * 
 */

public class Circle extends GeometricObject {
	  private double radius;

	  public Circle() {
	  }

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  /** Return radius */
	  public double getRadius() {
	    return radius;
	  }

	  /** Set a new radius */
	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  @Override /** Return area */
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }

	  /** Return diameter */
	  public double getDiameter() {
	    return 2 * radius;
	  }

	  @Override /** Return perimeter */
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }

	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	}