package ex;
/*一個程式求一整數序列所含之整數個數及平均值。一整數序列以空白鍵隔開數字。序列所含之整數個數及平均值。精確至小數點第 3 位(由小數點第 4 位四捨五入)
 * Date: 2016/12/12
 * Author: 103051060  黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char check = 'Y';
		float fin;
		String [] st;
		String str;
		while(check=='Y'||check=='y'){
			str = scn.nextLine();
			st = str.split(" ");
			fin = 0f;
			for(int i = 0 ; i<st.length ; i++){
				fin=fin+Float.valueOf(st[i]);
			}
			fin=fin/st.length;
			fin=(float)(Math.round(fin*1000))/1000;
			System.out.println("Size: "+st.length+"\nAverage: "+fin);
			System.out.print("Next?(Y/N): ");
			check = scn.nextLine().charAt(0);
		}
	}
}