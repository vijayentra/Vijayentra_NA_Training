// Java program to illustrate error while
// using class from different package with
// private modifier
public class AccessModifier {

	private void display()
	{
		System.out.println("GeeksforGeeks");
	}
}
//This class is having default access modifier 
class D
{
	public static void main(String args[])
	{
	AccessModifier obj = new AccessModifier();
		// Trying to access private method
		// of another class
		obj.display();
	}
}
