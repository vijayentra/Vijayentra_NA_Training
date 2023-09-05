
public class NonStaticMembersDemo {
	
	int num;
	
	NonStaticMembersDemo(){
		System.out.println("constructor");
	}
	public void output()
	{
		System.out.println("non static");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		NonStaticMembersDemo n = new NonStaticMembersDemo();
		n.output();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}
	static {
		System.out.println("static");
	}

}
