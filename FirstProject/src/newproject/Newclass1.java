package newproject;

public class Newclass1 {

	public  void newone() {
		int n = 9;
		int m = 9;
		int o = n + m;
		System.out.println(o);
		
		newone1() ;
	}

	public  void newone1() {
		int n = 9;
		int m = 9;
		int p = n + m;
		System.out.println(p);
	//	Newclass1 ref1 = new Newclass1();
	}

	public void newonenon() {
		int n = 8;
		int m = 9;
		int o = n + m;
		System.out.println(o + 2 + "kkkk");
		newone1();

	}

	public static void main(String[] args) {
	//	Newclass1 ref1 = new Newclass1();
		newonenon();

	}

}
