package newproject;
public class AllTypes {
	public  void check() {
		System.out.println("hello");
	}
	public  void check1() {
		check();
	}
	public void check2() {
		check1();
	}
	public static void main(String[] args) {
		AllTypes ref1 = new AllTypes();
		ref1.check2();
	}
}
