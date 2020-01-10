
public class mulimp  implements Runnable {

	
//		public void run()
//		{
//			System.out.println("thread is not running");
//		}
		public void run()
		{
			for(int counter=1;counter<=100;counter++)
			{
				System.out.println(Thread.currentThread().getName()+" thread is running "+counter);
			}
				
		}

		public static void main(String[] args) {
			mulimp m1= new mulimp();
			Thread t1= new Thread(m1,"first");
			Thread t2=new Thread(m1," second");
			t1.start();
			t2.start();
			t1.run();
			t2.run();

		}

	}