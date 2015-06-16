/* Derrick Fox
 * CS 213 31015
 * Comparable Interface
 * April 28, 2014
 * 
 */
public class main {
	public static void main(String[] args) {
	    // Create two comparable circles
	    Circle circle1 = new Circle(5);
	    Circle circle2 = new Circle(4);

	    // Display the max circle
	    Circle circle = (Circle)GeometricObject.max(circle1, circle2);
	    System.out.println("The max circle's radius is " +
	      circle.getRadius());
	    System.out.println(circle);

	}
}
