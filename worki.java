package HomeWork;
/**
 * 
 * @author Cristiano_Rino
 *
 */
public class worki {
	public static void main(String[] args) 
	{
		Bornnum();
	}
	public static boolean IsPrime(int num) 
	{
		if(num==1||num==0)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void Bornnum()
	{
		int sum[]=new int[100];
		int st=0;
		for(int i=0;st<100;i++)
		{
			if(IsPrime(i)==true)
			{
				sum[st]=i;
				st=st+1;
			}
		}
		for(int j=1;j<101;j++)
		{
			if(j%10==0)
			{
				System.out.print(sum[j-1]+"\n");
			}
			else
			{
				System.out.print(sum[j-1]+"\t");
			}
		}
	}
}
