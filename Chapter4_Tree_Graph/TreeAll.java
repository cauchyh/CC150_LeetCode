/*
	This part of code is used to solve some of the very typical problems of 
	tree data structure. 
	Use both recursion and non-recursion solution
	======================================
	
	1. To calculate the node number of a binary tree:
		getNodeNumRec(), getNodeNum()
	2. Get the depth of a binary tree
		getDepthRec(), getDepth()
	3. PreOrder Traversal, PostOrder Traversal, InOrder Traversal
		The recursion method is very trivial, only give the non-recursion method
	4. Level Traversal of a Binary Trees
		Give a non-recursion solution so far
	5. Transform a BNT into a DLL
		Use both recursion and non-recursion solution
    6. Get the node number of kth level
        Use both recursion and non-recursion solution, where the recursion solution is easy
    7. Get the number of leaf node
        This seems easy to operate. Queue will be necessary to solve this problem.

*/
import java.util.*;
import java.lang.*;

public class TreeAll
{
	// Problem 1
	// 1. To calculate the node number of a binary tree:
	// getNodeNumRec(), getNodeNum()
	public static int getNodeNumRec(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		else
		{
			int res1 = getNodeNumRec(root.left);
			int res2 = getNodeNumRec(root.right);
			int res = res1 + res2 + 1;
			return res;
		}
	}

	public static int getNodeNum(TreeNode root)
	{
		int count = 1;
		Queue <TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode cur = queue.remove();
			if (cur.left != null)
			{
				queue.add(cur.left);
				count ++;
			}
			if (cur.right != null)
			{
				queue.add(cur.right);
				count ++;
			}
		}
		return count;
	}

	// Problem2
	// 2. Get the depth of a binary tree
	// getDepthRec(), getDepth()
	public static int getDepthRec(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}

		int dep1 = getDepthRec(root.left);
		int dep2 = getDepthRec(root.right);
		int res = Math.max(dep1, dep2) + 1;
		return res;
	}

	public static int getDepth(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int currentLevelNode = 1;
		int nextLevelNode = 0;
		int depth = 0;
		queue.add(root);
		if (root == null)
		{
			return 0;
		}

		while (!queue.isEmpty())
		{
			currentLevelNode--;
			TreeNode cur = queue.remove();
			if (cur.left != null)
			{
				queue.add(cur.left);
				// currentLevelNode
				nextLevelNode++;
			}

			if (cur.right != null)
			{
				queue.add(cur.right);
				nextLevelNode++;
			}

			if (currentLevelNode == 0)
			{
				depth++;
				currentLevelNode = nextLevelNode;
				nextLevelNode = 0;
			}
		}
		return depth;
	}

	// Problem3
	// PreOrder Traversal, PostOrder Traversal, InOrder Traversal

	public static ArrayList<Integer> preOrderTraversal(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack<TreeNode> ();
        ArrayList<Integer> res = new ArrayList<Integer>();

        if (root == null)
        {
            return res;
        }
        
        TreeNode cur;
        stack.push(root);
        while (!stack.isEmpty())
        {
            cur = stack.pop();
            res.add(cur.val);
            if (cur.right != null)
            {
                stack.push(cur.right);
            }
            if (cur.left != null)
            {
                stack.push(cur.left);
            }
        }
        return res;

	}

	public static ArrayList<Integer> inorderTraversal(TreeNode root) 
    {
    	if (root == null)
    	{
    		return null;
    	}
    	ArrayList<Integer> res = new ArrayList <Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode> ();
		TreeNode cur = root;    	
    	while (true)
    	{
    		// first is to push all the left nodes into the stack
    		while (cur != null)
    		{
    			stack.push(cur);
    			cur = cur.left;
    		}

    		if (stack.isEmpty())
    		{
    			break;
    		}

    		cur = stack.pop();
    		res.add(cur.val);
    		cur = cur.right;
    	}
    	return res;
    }

    public static ArrayList<Integer> postorderTraversal(TreeNode root) 
    {
        if (root == null)
        {
            return (new ArrayList<Integer>());
        }
        ArrayList<Integer> res = new ArrayList<Integer> ();
        Stack <TreeNode> stack = new Stack <TreeNode>();
        stack.push(root);
        Stack <Integer> stackAdd = new Stack <Integer>();
        TreeNode cur;
        while (!stack.isEmpty())
        {
            // Post order is LEFT->RIGHT->SELF
            // We do SELF->RIGHT->LEFT since it is easier and reverse it using a stack
            cur = stack.pop();
            stackAdd.push(cur.val); // add the data into the first stack
            if (cur.left != null)
            {
                stack.push(cur.left);
            }
            if (cur.right != null)
            {
                stack.push(cur.right);
            }
        }
        // then reverse the order and add it to ArrayList
        while(!stackAdd.isEmpty())
        {
            res.add(stackAdd.pop());
        }
        return res;
    }

    // Problem 4
    // Level traversal a tree

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
    {
    	if (root == null)
    	{
    		return (new ArrayList<ArrayList<Integer>>());
    	}
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
    	Queue<TreeNode> queue = new LinkedList<TreeNode> ();
    	TreeNode cur;
    	int currentLevelNode = 1;
    	int nextLevelNode = 0;
    	int counter = 0;
    	// ArrayList<Integer> temp;
    	queue.add(root);
    	while (!queue.isEmpty())
    	{
    		res.add(new ArrayList<Integer>());
    		// ArrayList<Integer> 
    		for (int i=0; i<currentLevelNode; i++)
    		{
    			cur = queue.remove();
    			res.get(counter).add(cur.val);	
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
    			// System.out.println(queue);
    		}
    		// System.out.println(currentLevelNode);
    		// res.add(temp);
    		currentLevelNode = nextLevelNode;
    		nextLevelNode = 0;
    		counter++;
    		// queue.add(cur.right);	
    	}
    	return res;
    }

    // Problem 5
    // Convert a Binery search tree(BST) into double linked list(DLL)
    // public static TreeNode convertBST2DLLrec(TreeNode root)
    // {

    // }

    // Problem 6
    // Get the node number of the kth level
    public static int getNodeNumKthLevel(TreeNode root, int k)
    {
    	if (root == null)
    	{
    		return 0;
    	}
    	int currentLevel = 0;
    	int currentLevelNode = 1;
    	int nextLevelNode = 0;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	TreeNode cur;
    	queue.add(root);
    	while (!queue.isEmpty())
		{
			if (currentLevel == k)
			{
				return currentLevelNode;
			}

			for (int i=0; i<currentLevelNode; i++)
			{
				cur = queue.remove();
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
			
		}
		return 0;
    }

    public static int getNodeNumKthLevelRec(TreeNode root, int k)
    {
    	if (root == null)
    	{
    		return 0;
    	}

    	if (k == 1)
        {
            return 1;
        }

        int numLeft = getNodeNumKthLevelRec(root.left, k-1);
        int numRight = getNodeNumKthLevelRec(root.right, k-1);
        return numLeft + numRight;
    }
  
    // Problem 7. 
    // Get the number of leaf node
    public static int getNodeNumLeaf(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int leafNum = 0;
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode cur;
        queue.add(root);
        while(!queue.isEmpty())
        {
            cur = queue.remove();
            if (cur.left == null && cur.right == null)
            {
                leafNum++;
            }
            if (cur.left != null)
            {
                queue.add(cur.left);
            }
            if (cur.right != null)
            {
                queue.add(cur.right);
            }
            
        }
        return leafNum;
    }

    public static int getNodeNumLeafRec(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        
    }
}




















