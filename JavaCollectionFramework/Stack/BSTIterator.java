//Write a Java program to Binary Search Tree Iterator
import java.util.Stack;
class BSTIterator{
	public static void main(String[] args){
		TreeNode root = new TreeNode(60);
		root.left = new TreeNode(54);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(23);
		
		BST it = new BST(root);
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
	}
}
class BST{
	private Stack<TreeNode> stack;
	public BST(TreeNode root){
		stack = new Stack<>();
		pushAll(root);
	}
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	public int next(){
		TreeNode node = stack.pop();
		pushAll(node.right);
		return node.val;
	}
	private void pushAll(TreeNode node){
		while(node != null){
			stack.push(node);
			node = node.left;
		}
	}
}