/*
	Given a binary tree containing digits from 0-9 only, 
	each root-to-leaf path could represent a number.

	An example is the root-to-leaf path 1->2->3 which represents the number 123.

	Find the total sum of all root-to-leaf numbers.

	For example,

	    1
	   / \
	  2   3
	The root-to-leaf path 1->2 represents the number 12.
	The root-to-leaf path 1->3 represents the number 13.

	Return the sum = 12 + 13 = 25.
*/

public class SumRootToLeafNodes
{
	public int sumNumbers(TreeNode root) 
    {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode> ();
        Queue<Integer> pathQueue = new LinkedList<Integer> ();
        TreeNode cur;
        nodeQueue.add(root);
        pathQueue.add(root.val);
        int curVal;
        // ok! lets move out!
        while (!nodeQueue.isEmpty()) {
            cur = nodeQueue.remove();
            curVal = pathQueue.remove();
            if (cur.left != null) {
                nodeQueue.add(cur.left);
                pathQueue.add(curVal*10 + cur.left.val);
            }
            if (cur.right != null) {
                nodeQueue.add(cur.right);
                pathQueue.add(curVal*10 + cur.right.val);
            }
            if (cur.left == null && cur.right == null) {
                sum += curVal;
            }
        }
        return sum;
    }
}