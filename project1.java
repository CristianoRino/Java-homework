package T31727;
import java.util.*;
/**
 * 
 * @author Cristiano_Rino
 *
 */
public class project1 {

	public static void main(String[] args) {
		double[][][] inform;
		inform=Getinformation();
		Suminformation(inform);
	}
	public static double[][][] Getinformation() 
	{
		Scanner input=new Scanner(System.in);
		int SI=0,SII=0,SIII=0;
		System.out.print("请输入学生总位数:");
		SI=input.nextInt();
		System.out.print("请输入学科总个数:");
		SII=input.nextInt();
		System.out.print("请输入月考总次数:");
		SIII=input.nextInt();
		System.out.print("\n");
		double[][][] information=new double[SI][SII][SIII];
		for(int i=0;i<SI;i++)
		{
			int x=i+1;
			System.out.print("第"+x+"位同学:\n");
			for(int j=0;j<SII;j++)
			{
				int y=j+1;
				System.out.print("请输入第"+y+"个学科的成绩:");
				for(int k=0;k<SIII;k++)
				{
					information[i][j][k]=input.nextDouble();
				}
			}
		}
		return information;
	}
	public static void Suminformation(double[][][] information)
	{
		System.out.print("\n");
		double sumi[]=new double[information.length];
		double sums[]=new double[information.length];
		int lengths=0,lengthss=0;
		/*计算总分*/
		for(int z=0;z<sumi.length;z++)
		{
			sumi[z]=0;
		}
		for(int i=0;i<information.length;i++)
		{
			for(int j=0;j<information[i].length;j++)
			{
				lengths=information[i].length;
				for(int k=0;k<information[i][j].length;k++)
				{
					sumi[i]=sumi[i]+information[i][j][k];
				}
			}
		}
		for(int g=0;g<sumi.length;g++)
		{
			System.out.print("第"+(g+1)+"位同学全科总成绩为:"+sumi[g]+"\n");
		}
		System.out.print("\n");
		sums=selectionSort(sumi);
		for(int t=0;t<sumi.length;t++)
		{
			System.out.print("排名第"+(t+1)+"名同学全科总成绩为:"+sums[t]+"\n");
		}
		System.out.print("\n");
		/*计算各科总分及平均分*/
		double sumii[][]=new double[information.length][lengths];
		for(int a=0;a<information.length;a++)
		{
			for(int b=0;b<information[a].length;b++)
			{
				for(int c=0;c<information[a][b].length;c++)
				{
					sumii[a][b]=sumii[a][b]+information[a][b][c];
					lengthss=information[a][b].length;
				}
			}
		}
		double avg[]=new double[lengths];
		for(int f=0;f<information.length;f++)
		{
			for(int e=0;e<lengths;e++)
			{
				avg[e]=sumii[f][e]/lengthss;
				System.out.print("第"+(f+1)+"位同学第"+(e+1)+"科总成绩为:"+sumii[f][e]+"\n各科平均分为:"+avg[e]+"\n");
			}

		}
		/*排名*/
	}
	 public static double[] selectionSort(double[] a) 
	 {
		 double temp=0;
	     for (int i = 0; i < a.length; i++) 
	     {
	         for (int j = i + 1; j < a.length; j++) 
	         {
	             if (a[i] > a[j])
	             {
	                 temp=a[i];
	                 a[i]=a[j];
	                 a[j]=temp;
	             }
	         }
	     }
	     return a;
	 }
}
