/*
	Given a binary tree, return the zigzag level order traversal of its nodes' values.
	(ie, from left to right, then right to left for the next level and alternate between).

	For example:
	Given binary tree {3,9,20,#,#,15,7},
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its zigzag level order traversal as:
	[
	  [3],
	  [20,9],
	  [15,7]
	]
	confused what "{1,#,2,3}" means?
*/
import java.util.*;
public class ZigzagTraversal
{
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        if (root == null) { return new ArrayList<List<Integer>>(); }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode cur;
        queue.add(root);
        boolean reverseOrder = false;
        int curLevelNode = 1;
        int nextLevelNode = 0;
        List<Integer> temp = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            cur = queue.remove();
            curLevelNode --;
            temp.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
                nextLevelNode ++;
            }
            if (cur.right != null) {
                queue.add(cur.right);
                nextLevelNode ++;
            }
            // System.out.println(nextLevelNode);
            // update temp 
            if (curLevelNode == 0) {
            	System.out.println(temp);
                if (reverseOrder == true) {
                    res.add(reverse(temp));
                    reverseOrder =  false;
                } else {
                    res.add(temp);
                    reverseOrder = true;
                }
                curLevelNode = nextLevelNode;
                nextLevelNode = 0;
                temp = new ArrayList<Integer>();
            }
        }
        return res;
    }
    
    private static List<Integer> reverse(List<Integer> temp) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for (int i=0; i<temp.size(); i++) {
            stack.push(temp.get(i));
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}