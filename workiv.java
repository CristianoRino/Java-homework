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
        System.out.println("������һ���ַ�����");
        StringBuffer str = new StringBuffer(input.next());
        if(str.toString().equals(str.reverse().toString()))
        {
            System.out.println(str+"�ǻ��Ĵ�");
        }
        else
        {
            System.out.println(str+"���ǻ��Ĵ�");
        }
	}

}
