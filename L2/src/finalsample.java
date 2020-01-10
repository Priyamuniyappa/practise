
public class finalsample {
	final double pi;
	public finalsample()
	{
		pi=3.14;
	} 
	public  finalsample(double pi)
	{
		this.pi=pi;
	}

	public static void main(String[] args) {
		finalsample fs=new finalsample(22/7);
		System.out.println(fs.pi);
		
	}

}
