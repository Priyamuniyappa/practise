public class hands {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        
    }
}
public class threaddemo2 extends Thread {

	
	public void run()
	{
		System.out.println();
			
	}
}


	public static void main(String[] args) {
		threaddemo2 m1= new threaddemo2();
	  m1.start();
		
	}

}