/*
	Given a binary tree and a sum, find all root-to-leaf paths where 
	each path's sum equals the given sum.

	For example:
	Given the below binary tree and sum = 22,
	              5
	             / \
	            4   8
	           /   / \
	          11  13  4
	         /  \    / \
	        7    2  5   1
	return
	[
	   [5,4,11,2],
	   [5,8,4,5]
	]
*/
import java.util.*;
public class PathSumII {
	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) 
    {
        if (root == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<ArrayList<Integer>> pathQueue = new LinkedList<ArrayList<Integer>> ();
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode> ();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        nodeQueue.add(root);
        temp.add(root.val);
        pathQueue.add(temp);
        TreeNode cur;
        while(!pathQueue.isEmpty()) {
            cur = nodeQueue.remove();
            temp = pathQueue.remove();
            if (cur.left == null && cur.right == null && getSum(temp) == sum) {
                res.add(temp);
            }
            if (cur.left != null) {
                nodeQueue.add(cur.left);
                ArrayList<Integer> temp0 = new ArrayList<Integer>();
                temp0.addAll(temp);
                temp0.add(cur.left.val);
                pathQueue.add(temp0);
            }
            if (cur.right != null) {
                nodeQueue.add(cur.right);
                ArrayList<Integer> temp0 = new ArrayList<Integer>();
                temp0.addAll(temp);
                temp0.add(cur.right.val);
                pathQueue.add(temp0);
            }
        }
        return res;
        
    }
    
    private static int getSum(ArrayList<Integer> path) {
        int sum = 0;
        for (int i=0; i<path.size(); i++) {
            sum += path.get(i);
        }
        // System.out.println(sum);
        return sum;
    }
}