
public class Complex {
		
	int real;
	int img;
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	
	public int sum() 
	{
		return real+img;
	}
	
	public int diffrence() 
	{
		return real-img;
	}
	
	public int product() 
	{
		return real*img;
	}
	
	public void display()
	{
		System.out.println("---------------");
		System.out.println("Sum: " + sum());
		System.out.println("Diffrence: " + diffrence());
		System.out.println("Product: " + product());
	}
	
	
}
