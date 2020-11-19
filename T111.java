package test;
import java.util.Scanner;
/**
 * 
 * @author Cristiano_Rino
 *
 */
public class T111 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Triangle triangles = new Triangle();
		String color=null;
		boolean filled=false;
		double a=0,b=0,c=0;
		System.out.println("请输入颜色:");
		color=input.nextLine();
		triangles.SetColor(color);
		System.out.println("是否填充:");
		filled=input.nextBoolean();
		triangles.SetFill(filled);
		System.out.println("请输入第一条边:");
		a=input.nextDouble();
		triangles.SetSide1(a);
		System.out.println("请输入第二条边:");
		b=input.nextDouble();
		triangles.SetSide2(b);
		System.out.println("请输入第三条边:");
		c=input.nextDouble();
		triangles.SetSide3(c);
        System.out.println(triangles.ToString());
	}
}
class GeometricObject
{
	private String color="none";
	private boolean filled;
	public GeometricObject() 
	{
	}
	public String GetColor()
	{
		return color;
	}
	public void SetColor(String color)
	{
		this.color=color;
	}
	public boolean GetFill()
	{
		return filled;
	}
	public void SetFill(boolean filled)
	{
		this.filled=filled;
	}
	public String ToString()
	{
		return "Is Fill?\n"+filled+"\nAnd Color is:"+color;
	}
}
class Triangle extends GeometricObject
{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	public Triangle()
	{
		super();
		side1=side2=side3=1.0;
	}
	public double GetSide1()
	{
		return side1;
	}
	public void SetSide1(double side1)
	{
		this.side1=side1;
	}
	public double GetSide2()
	{
		return side2;
	}
	public void SetSide2(double side2)
	{
		this.side2=side2;
	}
	public double GetSide3()
	{
		return side3;
	}
	public void SetSide3(double side3)
	{
		this.side3=side3;
	}
	public double GetArea()
	{
		double c=(side1+side2+side3)/2;
		return Math.sqrt(c * (c - side1) * (c - side2) * (c - side3));
	}
	public double GetPerimeter()
	{
		return side1+side2+side3;
	}
	public String ToString()
	{
		return "Triangle:\n第一条边:"+side1+"\n第二条边:"+side2+"\n第三条边:"+side3+"\n周长为:"+GetPerimeter()+"\n面积为:"+GetArea()+"\n颜色为:"+GetColor()+"\n是否填充:"+GetFill();
	}
}
