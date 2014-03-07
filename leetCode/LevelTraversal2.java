/*Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
	3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7]
  [9,20],
  [3],
]
*/
import java.util.*;
import java.lang.*;
public class LevelTraversal2
{
	public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) 
	{
		if (root == null)
        {
            return (new ArrayList<ArrayList<Integer>>());
        }
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        // Stack <ArrayList<Integer>> stack = new Stack <ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        Queue <TreeNode> queue = new LinkedList<TreeNode> ();
        queue.add(root);
        TreeNode cur;
        int currentLevel = 0;
        int currentLevelNode = 1;
        int nextLevelNode = 0;
        while (!queue.isEmpty())
        {
            temp.add(new ArrayList<Integer>());
            for (int i=0; i<currentLevelNode; i++)
            {
                cur = queue.remove();
                temp.get(currentLevel).add(cur.val);
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
            }
            currentLevelNode = nextLevelNode;
            nextLevelNode = 0;
            currentLevel++;
            // stack.get
        }
        for (int i=0; i<currentLevel; i++)
        {
        	// res.add()
        	res.add(temp.get(currentLevel-i-1));
        }
        return res;
	}
}












