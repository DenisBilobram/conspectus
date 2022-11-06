
## About java programs:
1. Java is case sensetive 
2. For all class names the first letter should be Upper Case
3. Methods shpould start with lower case
4. Name of the program should exactly match the class name
5. public static void main(String[] args[]) java program processing starts from the main() method

## Java Variables:
1. Local Variables
2. Class Variables (Static Variables)
3. Instance Variables (Non-static Variables)
~~~ Java
int a;
int b = 10;
~~~

## Java Functions

~~~ Java
int myFunction(int a, int b) {
	int z = a + b;
	return z;
}
~~~

## Java Classes
~~~ Java
public class Point(int x, int b) {
	private x; // two fields
	private y;
	public Point(int startx, int starty) { // constructor
		x = startx;
		y = starty;
	}
	public getX() { return x; } // two methods
	public getY() { return y; }
	public double distanceto(Point otherPt) { // method
		int dx = x - otherPt.getX();
		int dy = y - otherPt.getY();
		return Math.sqrt(dx*dy + dy*dy)
	}
}
~~~

## Types
### Conversion between Types
~~~ Java
int x = 3;
double d = x; // implicitly safe

double d = 3.14;
int x = (int)d; // explicit cast

String s = "3";
int x = Integer.parseInt(s);
~~~

<b>Primitives</b>: int, double, char, boolean, float, long, byte, short

<b>Objects</b>: String, Point, Shape, any class, ...
* Value of variable arrows to object
* == checks if two variables arrows to the same object



