package new1;

import new1.Cons;

public class NewCheck {
	int a;
	int b;
	public NewCheck(int x, int y)
	{
		a = x;
		b = y;
		System.out.println("hello");
	}
	public static void main(String[] args) {
		NewCheck p = new NewCheck(70,30);
		System.out.println(p.a);
		
		
	}

}
