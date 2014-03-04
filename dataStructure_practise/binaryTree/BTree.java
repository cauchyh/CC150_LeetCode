/*
	An implementation of a binary search tree.
*/


public class BTree
{
	public int value;
	// public BTree parent;
	public BTree left;
	public BTree right;
	
	public BTree(int data)
	{
		value = data;
		BTree parent = null;
	}


	public void insert(int data)
	{
		// if ()
		BTree newPoint = new BTree(data);
		BTree cur = this;
		BTree temp = cur;
		while (cur != null)
		{
			if (data < cur.value)
			{
				temp = cur;
				cur = cur.left;
			}
			else if (data == cur.value) 
			{
				return;		
			}
			else
			{
				temp = cur;
				cur = cur.right;
			}
		}
		if (data < temp.value)
		{
			temp.left = newPoint;
		}
		else
		{
			temp.right = newPoint;
		}
	}

	public boolean search(int data)
	{
		BTree cur = this;
		while(cur != null)
		{
			if (data < cur.value)
			{
				cur = cur.left;
			}
			else if (data == cur.value) 
			{
				return true;	
			}
			else
			{
				cur = cur.right;
			}
		}
		return false;
	}

	public static void inOrder(BTree root)
	{
		if (root != null)
		{
			inOrder(root.left);
			System.out.print(root.value + " ");
			inOrder(root.right);
		}

	}

	public boolean delete(int data)
	{ 	
		BTree cur = this;
		BTree pre = cur;
		// System.out.println(cur.value);
		// boolean isLeftNode;
		/*
		First is need to find the node,
		If found, true; else false
		*/
		while (cur != null)
		{
			if (cur.value == data)
			{
				// System.out.println("find point " + cur.value);
				// the point found
				/*
					Mainly Two cases, easy one and a difficult one
				*/
				// Case ONE, the node is leaf node or have only one child node
				if (cur.left == null || cur.right == null)
				{
					if (cur.value < pre.value) // pre should point to its left
					{
						if (cur.left == null)
						{
							pre.left = cur.right;
						}
						else
						{
							pre.left = cur.left;
						}
					}
					else
					{
						if (cur.left == null)
						{
							pre.right = cur.right;
						}
						else
						{
							pre.right = cur.left;
						}
					}
				}
				else // Case TWO, the node has Two child node
				{
					/*
						If the node has two child nodes, then
						the first is to find the successor
					*/
					BTree suc = cur.right;
					BTree suc_par = cur;
					while (suc.left != null)
					{
						suc_par = suc;
						suc = suc.left;
					}
					// if the node is root node
					// if ()
					suc_par.left = suc.right;
					suc.left = cur.left;
					suc.right = cur.right;
					// suc_par = suc.right;
					if (pre.value > cur.value)
					{
						pre.left = suc;
					}
					else // pre.value < cur.value
					{
						pre.right = suc;
					}
				}

				return true; // node found, return true


			}

			else if (data < cur.value)
			{
				pre = cur;
				cur = cur.left;
			}

			else // cur.value < data
			{
				pre = cur;
				cur = cur.right;
			}
		}
		return false; // node not found

		// BTree cur = this;
		// while (cur != null)
		// {
		// 	if (data == cur.value) // if the data is find in the tree
		// 	{
		// 		if (cur.left == null || cur.right == null)
		// 		{
		// 			// the easiest case would be the leaf node
		// 			// or the node has only one child node
		// 			if (cur.value < parent.value)
		// 			{
		// 				cur.parent.left = cur.right;
		// 			}
		// 			else
		// 			{
		// 				cur.parent.left = cur.left;
		// 			}
		// 			return true;
		// 		}

		// 		else // the case when the node has both left and right node
		// 		{
		// 			BTree suc;
		// 			suc = cur.right;
		// 			while(suc.left != null)
		// 			{
		// 				suc = suc.left;
		// 			}
		// 			suc.parent.left = suc.right;
		// 			suc.right = cur.right;
		// 			suc.left = cur.left;
		// 			if (cur.value < cur.parent.value) // indicate the left node
		// 			{
		// 				cur.parent.left = suc;
		// 			}
		// 			else
		// 			{
		// 				cur.parent.right = suc;
		// 			}
		// 			return true;
		// 			// need to find the successor first

		// 			//return true;
		// 		}
		// 	}

		// 	else if (data < cur.value)
		// 	{
		// 		cur = cur.left;
		// 	}

		// 	else // data > cur.value
		// 	{
		// 		cur = cur.right;
		// 	}
		// }
		// return false; // if data is not found in the tree
	}
}