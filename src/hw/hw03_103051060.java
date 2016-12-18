package hw;
/*請撰寫一個二元樹的程式，建立 BinTree class 及 Node class，並提供前序、中序及後序搜尋以顯示資料。
 * Date: 2016/12/12
 * Author: 103051060  黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {
	private static BinTree bTree;
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		char contChar = 'Y';
		float v1=0;
		while(contChar=='Y'||contChar=='y'){
			System.out.print("Number: ");
			v1= scn.nextFloat();
			if(bTree==null){
				bTree = new BinTree(v1);
			}else{
				bTree.addNode(v1);
			}
			bTree.inOrder(bTree.root);
			System.out.print("\ncontinue? ");
			contChar = scn.next().charAt(0);
		}
	}
}
class BinTree{
	public Node root;
	public BinTree(float v1){
		root = new Node(v1);
	}
	public void addNode(float v1){
		Node tmpNode = root;
		while(true){
			if(v1<tmpNode.getVal()){
				if(tmpNode.getLeftNode()==null){
					tmpNode.addLeftNode(v1);
					break;
				}else{
					tmpNode=tmpNode.getLeftNode();
					continue;
				}
			}else{
				if(tmpNode.getRightNode()==null){
					tmpNode.addRightNode(v1);
					break;
				}else{
					tmpNode = tmpNode.getRightNode();
					continue;
				}
			}
		}
	}
	public void inOrder(Node node){
		if(node.getLeftNode()!= null){
			inOrder(node.getLeftNode());
		}
		System.out.print(node.getVal()+"\t");
		if(node.getRightNode()!= null){
			inOrder(node.getRightNode());
		}
	}
}
class Node{
	private Node left,right;
	private float data;
	public Node (float val){
		this.data= val;
		this.left = null;
		this.right = null;
	}
	public float getVal(){
		return this.data;
	}
	public Node getLeftNode(){
		return this.left;
	}
	public Node getRightNode(){
		return this.right;
	}
	public void addLeftNode (float v1){
		this.left = new Node(v1);
	}
	public void addRightNode (float v1){
		this.right = new Node(v1);
	}
}