
public class multirunna  implements Runnable{

//	public void run()
//	{
//		System.out.println("thread is not running");
//	}
	public void run()
	{
		for(int counter=1;counter<=100;counter++)
		{
			System.out.println("thread is running "+counter);
		}
			
	}

	public static void main(String[] args) {
		multirunna m1= new multirunna();
		Thread t1= new Thread(m1);
		t1.start();

	}

}
