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
*/
import java.util.*;
public class BTreeZigTraversal
{
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        if (root == null)
        {
            return new ArrayList<ArrayList<Integer>>();
        }
        Stack <Integer> stack = new Stack<Integer> (); // use to reverse order
        Queue <TreeNode> queue = new LinkedList<TreeNode> ();
        queue.add(root);
        int curLevelNode = 1;
        int nextLevelNode = 0;
        boolean isEvenLevel = false;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        TreeNode cur;
        while (!queue.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i=0; i<curLevelNode; i++)
            {
                // temp = new ArrayList<Integer> ();
                cur = queue.remove();
                // check current level and decide to pop out directly or push into a stack
                if (isEvenLevel)
                {
                    stack.push(cur.val);
                }
                else
                {
                    temp.add(cur.val);
                }
                
                // add new nodes and update next level node number 
                if (cur.left != null)
                {
                    queue.add(cur.left);
                    nextLevelNode++;
                }
                if (cur.right != null)
                {
                    queue.add(cur.right);
                    nextLevelNode++;
                }
                
                // produce the right order for different level
            }
            if (isEvenLevel)
            {
                while (!stack.isEmpty())
                {
                    temp.add(stack.pop());
                }
                isEvenLevel = false;
            }
            else
            {
                isEvenLevel = true;
            }
            curLevelNode = nextLevelNode;
            nextLevelNode = 0;
            res.add(temp);
        }
        return res;
        
    }
}