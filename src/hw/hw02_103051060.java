package hw;
/*一個含 N 個整數的序列中，出現頻率超過 N/2 的整數稱為『過半元素』。寫一個程式求一整數序列是否有過半元素(一整數序列以空白鍵隔開數字;0 < N < 11; 序列中的數字都是 integer; 輸入包含多 行，一行為一筆測資。若有 過半元素， 輸出該數; 否則輸出 NO)
 * Date: 2016/12/12
 * Author: 103051060  黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char check = 'Y';
		while(check=='Y'||check=='y'){
			String str = scn.nextLine();
			String st[] = str.split(" ");
			int num1 = 0;
			int num2 = 0;
			String fin ="";
			for(int i = 0 ;i<st.length ; i++){
				for(int j = 0 ; j<st.length ; j++){
					if(st[i].equals(st[j])){
						num2++;					
					}
				}
				if(num2>=num1){
					num1=num2;
					fin=st[i];
				}
				num2=0;
			}
			if(num1>st.length/2){
				System.out.println(fin);
			}else{
				System.out.println("No");
			}
			System.out.print("Next?(Y/N): ");
			check = scn.nextLine().charAt(0);
		}
	}
}