import java.util.*;

class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) 
	{
	  val = x; 
	}
}

public class test
{
	public static void main(String[] args)
	{
		
		// constructure a tree first to test the tree test
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;

		TreeNode res = Problem7.firstCommonAncestor(t1, t3, t6);
		System.out.println(res.val);
		// ArrayList<LinkedList<TreeNode>> res = Problem4.createLevelLList(t1);
		// boolean res = Problem5.isBST(t1);
		// System.out.println(res);

		// int k = TreeAll.getNodeNumKthLevel(t1,2);
		// System.out.println(k);
		// ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
		// res = TreeAll.levelOrder(t1);
		// System.out.println(res);
		// int res1 = TreeAll.getNodeNumRec(t1);
		// int res2 = TreeAll.getNodeNum(t1);
		// int res1 = TreeAll.getDepthRec(t1);
		// int res2 = TreeAll.getDepth(t1);
		// System.out.println(res1);
		// System.out.println(res2);


	}
}
