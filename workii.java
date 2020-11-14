package HomeWork;

import java.util.Scanner;

/**
 * 
 * @author Cristiano_Rino
 *
 */
public class workii {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] grade= new double[6];
		double temp=0;
		System.out.print("请输入六位同学的成绩:");
		for(int i=0;i<grade.length;i++)
		{
			temp=input.nextDouble();
			if(temp<0 && temp>100)
			{
				System.out.print("数据错误");
			}
			else
			{
				grade[i]=temp;
			}
		}
		System.out.print("排序前:\n");
		for(int k=0;k<grade.length;k++)
		{
			System.out.print(grade[k]);
			System.out.print("\t");
		}
		System.out.print("\n排序中:");
		BubbleSort(grade);
		System.out.print("\n排序后:\n");
		for(int j=0;j<grade.length;j++)
		{
			System.out.print(grade[j]);
			System.out.print("\t");
		}
	}
	public static double[] BubbleSort(double sum[])
	{
		double data=0;
		for(int i=0;i<sum.length-1;i++)
		{
			for(int j=0;j<sum.length-1-i;j++)
			{
				if(sum[j]>sum[j+1])
				{
					System.out.print("\n"+sum[j]+"将与"+sum[j+1]+"变换:\t");
					data=sum[j];
					sum[j]=sum[j+1];
					sum[j+1]=data;
					System.out.print("\n");
					for(int k=0;k<sum.length;k++)
					{
						System.out.print(sum[k]+"\t");
					}
				}
			}
		}
		return sum;
	}

}
