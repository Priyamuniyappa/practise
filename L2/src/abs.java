
public class abs {
private int x;
private int y;
public void setX(int x) {
	this.x=(x>79?79:(x<0?0:x));//refering to instance variable using
}
public void setY(int y) {
this.y=(y>24?24:(y<0?0:y));
}
public int getX()
{
	return x;
}
public int getY()
{
	return y;
}


	public static void main(String[] args) {
		int a,b;
		abs as=new abs();
		as.setX(22);
		as.setY(44);
		a=as.getX();
		System.out.println("the value"+a);
		b=as.getY();
		System.out.println("the value"+b);
		

	}

}
