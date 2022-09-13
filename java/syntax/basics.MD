
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

## Java Enums:
> Enum restrict variable to have only one of a few predicted values.
> 
~~~ Java
class FreshJuice {
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE} <br>
	FreshJuiceSize size; <br>
}
public class FreshJuiceTest {
	public static void main(String[] args[]) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}
~~~