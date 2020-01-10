
public class exception2 {
		public static int main(String args[]) {
			int i=0;
		try {
			System.out.println("try block");
			if(i==0) {
				throw new Exception();
			}
			return 1;
		  
		 } 
		catch (Exception e) 
		{
		System.out.println("catch"); 
		return 2;

		}
		finally
		{
			System.out.println("finally");
			return 3;
		}
}
		}
