
public class threaddemo2 extends Thread {

	
	public void run()
	{
		for(int counter=1;counter<=100;counter++)
		{
			System.out.println(" thread is running "+counter);
		}
			
	}

	public static void main(String[] args) {
		threaddemo2 m1= new threaddemo2();
	  m1.start();
		
	}

}
