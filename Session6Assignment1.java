
public class Session6Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 c1=new class1();
		System.out.println("Number from Class1:->"+c1.ReturnNum(10));
		
		class2 c2=new class2();
		System.out.println("Square of Number from Class2:->"+c2.ReturnNum(10));
	}

}

 interface NumberCal
 {
	 public int ReturnNum(int x);
 }
 
 class class1 implements NumberCal
 {
	 public int ReturnNum(int a)
	 {
		 return a;
	 }
 }
 
 class class2 implements NumberCal
 {
	 public int ReturnNum(int a)
	 {
		 return a*a;
	 }
 }