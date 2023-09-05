
//	Program to Illustrate Use of Final Keyword
class Figure
{
//	When a variable is declared as final, its value cannot be changed once it has been initialized.
    final int length = 5;
    final int bredth = 4;
    final void area()
    {
        int a = length * bredth;
        System.out.println("Area:"+a);
    }
}
class Rectangle extends Figure
{
//	When a method is declared as final, it cannot be overridden by a subclass.
    final void rect()
    {
        System.out.println("This is rectangle");
    }
}

//When a class is declared as final, it cannot be extended by a subclass.
final public class FinalKeyword extends Rectangle
{
    public static void main(String[] args) 
    {
    	FinalKeyword obj = new FinalKeyword();
        obj.rect();
        obj.area();
    }
}