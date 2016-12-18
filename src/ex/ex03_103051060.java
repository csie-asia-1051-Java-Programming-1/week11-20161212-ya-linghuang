package ex;
/*請利用 class 概念製作一個鏈結串列，讓使用者可以輸入資料並尋找
 * Date: 2016/12/12
 * Author: 103051060  黃雅鈴
 */
import java.util.Scanner;

public class ex03_103051060 {
	public static LinkList list;
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		char contChar = 'Y';
		float v1 = 0;
		boolean flag = true;
		while(contChar=='Y'||contChar=='y'){
			flag = true;
			System.out.print("Number: ");
			try{
				v1 = scn.nextFloat();
				if(list==null){
					list= new LinkList(v1);
				}else{
					list.addNode(v1);
				}
			}catch(NumberFormatException e){
				System.out.println("Please provide correct input");
				continue;
			}catch(Exception e1){
				System.out.println("Error: "+e1.toString());
				continue;
			}
			System.out.println("In order");
			list.showAll(list.root);
			System.out.print("\nContinue(Y/n)? ");
			contChar = scn.next().charAt(0);
		}
		System.out.println("Thank you for using this system!! See u next time! ");
		list = null;
	}
}
class LinkList{
	public static Node root;
	public LinkList(float va1){
		root = new Node(va1);
	}
	public void addNode(float v1){
		Node node = root;
		while(node.next()!= null){
			node = node.next();
		}
		node.addNext(v1);
	}
	public void showAll(Node node){
		while(true){
			if(node!=null){
				System.out.print(node.getData()+"\t");
				node=node.next();
			}else{
				break;
			}
		}
	}
}
class Node{
	private float data;
	private Node next;
	public Node(float va1){
		this.data = va1;
		this.next = null;
	}
	public float getData(){
		return this.data;
	}
	public Node next(){
		return this.next;
	}
	public void addNext(float v1){
		this.next = new Node(v1);
	}
}