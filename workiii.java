package HomeWork;

import java.util.Scanner;
import HomeWork.Rational;

/**
 * 
 * @author Cristiano_Rino
 *
 */
public class workiii 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=0;
		System.out.print("������nֵ:");
		n=input.nextInt();
		Rational sumi=new Rational();
		Rational sumii=new Rational();
		for(int i=1;i<=n;i++)
		{
			sumi=sumi.add(new Rational(i-1,i));
			sumii=sumii.add(new Rational(i-1,i*i));
		}
		System.out.print("1/1+1/2+1/3+...+1/n��ֵΪ:"+sumi.doubleValue()+1+"\n");
		System.out.print("1/1+1/2+1/2(2)+...+1/2(n)��ֵΪ:"+sumii.doubleValue()+1);
	}

}
