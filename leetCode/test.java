import java.util.*;

class ListNode 
{
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

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

		ArrayList<ArrayList<Integer>> res = LevelTraversal2.levelOrderBottom(t1);
		System.out.println(res);
		// System.out.println();
		
		// int[] t1 = new int[20]; 
		// int[] t1 = {1,3,5,7,9,0,0,0,0,0};
		// int[] t2 = {2,4,6,8,10}; 
		// MergeSArray.merge(t1, 5, t2, 5);
		// for (int i=0; i<t1.length; i++)
		// {
		// 	System.out.println(t1[i]);
		// }

		// t2 = {2,4,6,8,10,11};

		// int[] t1 = {2, 7, 11, 15};
		// int target = 9;
		// int place = SearchInsertPosition.searchInsert(t1, target);
		// System.out.println(place);
		// int[] res = TwoSum.twoSum(t1, target);
		// System.out.println("{" + res[0] + ", " + res[1] +"}");

		// ListNode l1 = new ListNode(1);
		// ListNode l2 = new ListNode(3);
		// ListNode l3 = new ListNode(5);
		// ListNode l4 = new ListNode(7);
		// ListNode l5 = new ListNode(9);

		// l1.next = l2;
		// l2.next = l3;
		// l3.next = l4;
		// l4.next = l5;

		// ListNode l6 = new ListNode(2);
		// ListNode l7 = new ListNode(4);
		// ListNode l8 = new ListNode(6);
		// ListNode l9 = new ListNode(8);
		// ListNode l10 = new ListNode(10);

		// l6.next = l7;
		// l7.next = l8;
		// l8.next = l9;
		// l9.next = l10;
		// System.out.println(l1.val);
		// ListNode t1;
		// t1 = MergeTwoSLists.mergeTwoLists(l1, l6);
		// ListNode cur = t1;
		// // System.out.println(cur.val);
		// while (cur != null)
		// {
		// 	System.out.println(cur.val);
		// 	cur = cur.next;
		// }
		// // l5.next = l2;

		// // boolean t1 = LinkedCycle.hasCycle(l1);
		// ListNode t1 = RemoveDuplicate.deleteDuplicates(l1);
		// System.out.println(t1);
		// ListNode cur = t1;
		// while (cur!= null)
		// {
		// 	System.out.println(cur.val);
		// 	cur = cur.next;
		// }

	}
}