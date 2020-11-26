package HomeWork;
import java.util.Scanner;
/**
 * 
 * @author Cristiano_Rino
 *
 */
public class workiv {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        StringBuffer str = new StringBuffer(input.next());
        if(str.toString().equals(str.reverse().toString()))
        {
            System.out.println(str+"是回文串");
        }
        else
        {
            System.out.println(str+"不是回文串");
        }
	}

}
