package newproject;

public class Array {
	public void ArrayGroup() {
		//datatype [] arrayname = {data0, data1, data2};
		//datatype [] arrayname1 = new datatype [];
		
		int [] nan = new int [6];
		nan[3]=50;
		int numk = nan[3];
		System.out.println(numk);
		
		
		
		
	//	datatype [] arrayname = {10,20,30,40};
		 int [] arrayb  = {10,20,30,40};
		int nu = arrayb[0];
	//	datatype [] arrayname = new datatype [];
		int [] arrayname1 = new int [7];
		
		arrayname1[6] = 70;
		//int ttt = arrayname1[5];
		System.out.println("hiiii "+ arrayname1[6] + " "+ arrayname1[5]);
	//
		
		int [] array1 = {10,11,44};
		int number = array1[0];
		int number1 = array1[2];
		System.out.println(number +" "+ number1);
		}
	public static void array3() {
		Array array = new Array();
		array.ArrayGroup();
		System.out.println("hi");
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		array3();
		Array array1 = new Array();
		array1.ArrayGroup();
		
		
	}
	
	}


