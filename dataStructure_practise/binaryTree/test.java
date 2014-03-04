/*
	A test function that is used to test the funciton of a binary search tree
*/

	public class test
	{
		public static void main(String[] args)
		{
			BTree bt1 = new BTree(5);
			for (int i=1; i<=10; i=i+2)
			{
				bt1.insert(i);
			}
			for(int i=0; i<=10; i=i+2)
			{
				bt1.insert(i);
			}
			System.out.println(bt1.search(3));
			BTree.inOrder(bt1);
			System.out.println();

			System.out.println(bt1.delete(8));
			BTree.inOrder(bt1);
			System.out.println();
		}
	}