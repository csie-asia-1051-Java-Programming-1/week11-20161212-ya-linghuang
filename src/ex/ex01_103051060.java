package ex;
/*公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，該如何選購獎品，使得總花費最少且不超過預算?
1.說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據，第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， k 代表有 k 件物品可供選購。第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。
2.對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，則列印 “Impossible”，最後必須有換行字元
 * Date: 2016/12/12
 * Author: 103051060  黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 0;												//資料筆數
		while(true){
			n = scn.nextInt();	
			if(n<=10&&n>=1){break;}
			else{
				System.out.print("1<=n=<10!");
			}	
		}
		int fin[] = new int[n];
		for(int f = 0 ; f<n ; f++){
			int T = 0;												//總預算
			int m =0;												//員工數
			int k = 0;												//可選購禮物數
			while(true){
				T = scn.nextInt();	
				m =scn.nextInt();
				k = scn.nextInt();	
				if(m<=k&&k<=100){break;}
			}
			int km []=new int[k];							//禮物價格
			for(int i = 0 ; i<k ; i++){
				km[i]=scn.nextInt();
			}
			for(int i = 0; i<k ; i++){
				for(int j = 0 ; j<k ; j++){
					if(km[j]>km[i]){
						int tmp = km[i];
						km[i]=km[j];
						km[j]=tmp;
					}
				}
			}
			if(km[0]+km[1]+km[2]>T){
				fin[f]=0;
			}else{
				fin[f] = km[0]+km[1]+km[2];
			}
		}
		for(int f = 0 ; f<n ; f++){
			if(fin[f]==0){
				System.out.println("Impossible");
			}else{
				System.out.println(fin[f]);
			}
		}
	}
}