
public class ThreadInfo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println( "current thread:"+t);
		t.setName("demo");
		System.out.println("new name of the thread:"+t);
		try
		{
			Thread.sleep(1000);
		
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread Interrupted");
		}

	}

}
