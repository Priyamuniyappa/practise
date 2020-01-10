final class Gbase {//we cannot execute compile time error
	 public void display(String s)
	 {
		 System.out.println(s);
	 }
	
 }
 class B extends Gbase{
	 public void display(String s)
	 {
		 System.out.println(s);
	 }

	public static void main(String[] args) {
		B ob= new B();
		ob.display("try me");
		

	}

}
 
 //final keyword in a class is used to avoid it from inheriting
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
