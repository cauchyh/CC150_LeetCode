import java.util.*;

class ListNode 
{
    int val;
	ListNode next;
	ListNode(int x) 
	{
		val = x;
		next = null;
	}

	public void display()
	{
		ListNode cur = this;
		while(cur != null)
		{
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
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

interface Edible
{
	public abstract String howToEat();
}

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

public class test
{
	public static void main(String[] args)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(-1);
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		input.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(2);
		temp.add(3);
		input.add(temp);
		temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(-1);
		temp.add(3);
		input.add(temp);
		int res = Triangle2.minimumTotal(input);
		System.out.println("res is: " + res);
		// ArrayList<ArrayList<Integer>> res = PascalII.generate(3);
		// System.out.println(res);
		// RandomListNode r1 = new RandomListNode(1);
		// RandomListNode r2 = new RandomListNode(2);
		// RandomListNode r3 = new RandomListNode(3);
		// RandomListNode r4 = new RandomListNode(4);
		// r1.next = r2;
		// r2.next = r3;
		// r3.next = r4;
		// RandomListNode res = CopyListWithRanPointer.copyRandomList(r1);
		// RandomListNode cur = res;
		// while (cur != null) {
		// 	System.out.println(cur.label);
		// 	cur = cur.next;
		// }
		// String[] in = new String[] {"1","1","1"};
		// ArrayList<String> res = Anagrams.anagrams(in);
		// System.out.println(res);
		// String res = AddBinary2.addBinary("1010", "1011");
		// System.out.println(res);
		// TreeNode r1 = new TreeNode(1);
		// TreeNode r2 = new TreeNode(-2);
		// TreeNode r3 = new TreeNode(3);
		// r1.left = r2;
		// r1.right = r3;
		// ArrayList<ArrayList<Integer>> res = PathSumII.pathSum(r1, -1);
		// System.out.println(r1);
		// char[][] input = new char[9][9] {"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
		// boolean res = ValidSudoku.isValidSudoku(input);
		// System.out.println(res);

		// String test1 = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";
		// int res = LongestNoRepeatSubstring.lengthOfLongestSubstring(test1);
		// System.out.println(res);
		// int[][] t1 = new int[2][2];
		// System.out.println(t1[0][0]);
		// int[] tese = {0,1,2,3,4,5,6,7};
		// int[] res = Arrays.copyOfRange(tese, 1, 2);
		// System.out.println(res[1]);
		// System.out.println(res);
		// Random random = new Random();
		// while (true)
		// {
		// 	int res = random.nextInt(5);
		// 	System.out.println(res);

		// }
		// ArrayList<String> res = GenerateParentheses.generateParenthesis(3);
		// System.out.println(res);
		// String res = CountAndSay.countAndSay(6);
		// System.out.println(res);
		// Integer n1 = new Integer(1);
		// Integer n2 = new Integer(2);
		// System.out.println(n1.compareTo(n2));
		// Scanner input = new Scanner(System.in);
		// System.out.print("Enter two numbers: ");
		// int number1 = input.nextInt();
		// int number2 = input.nextInt();
		// System.out.println(number1/number2);
		// int[] array = {1,2,3};
		// ArrayList<ArrayList<Integer>> res = Subset.subsets(array);
		// System.out.println(res);		

		// String input = "MCMXCVI";
		// int res = RomanToInteger.romanToInt(input);
		// System.out.println(res);
		// int res = UniqueBTree.numTrees(5);
		// System.out.println("result: " + res);
		// int[] test = new int[1];
		// System.out.println(test[0]);
		// ArrayList<ArrayList<Integer>> in = new ArrayList<ArrayList<Integer>>();
		// ArrayList<Integer> a1 = new ArrayList<Integer>();
		// ArrayList<Integer> a2 = new ArrayList<Integer>();
		// ArrayList<Integer> a3 = new ArrayList<Integer>();
		// a1.add(-1);
		// a2.add(2);
		// a2.add(3);
		// a3.add(1);
		// a3.add(-1);
		// a3.add(-3);
		// in.add(a1);
		// in.add(a2);
		// in.add(a3);
		// int res = Triangle.minimumTotal(in);
		// System.out.println(res);

		// int[] r1 = new int[]{4,15,5,6,6,1};
		// Arrays.sort(r1);
		// for (int i=0; i<r1.length; i++)
		// {
		// 	System.out.print(r1[i] + " ");
		// }
		// System.out.println(r1);
		// int[][] test = new int[1][1];

		// int res = UniquePath.uniquePaths(3,3);
		// System.out.println(res);
		// int[][] mn = new int[3][3];
		// System.out.println(mn[1][1]);
		// int[] m = new int[3];
		// System.out.println(m[0]+" "+m[1]);
		// ArrayList<Integer> res = GrayCode.grayCode(5);
		// System.out.println(res);
		// int[] a1 = new int[]{1,2,3};
		// ArrayList<ArrayList<Integer>> res = Permutations.permute(a1);
		// System.out.println(res);
		// ArrayList<Integer> res = new ArrayList<Integer>();
		// for (int i:a1)
		// {
		// 	res.add(i);
		// }
		// System.out.println(res);
		// System.out.println(a1[3]);
		// ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(a1));
		// Collections.addAll(res,a1);
		// res.add(4);
		// System.out.println(res);
		// ArrayList<Integer> r1 = new ArrayList<Integer> ();
		// r1.add(1);
		// r1.add(2);
		// ArrayList<Integer> r2 = new ArrayList<Integer> (r1);	
		// r2.add(3);
		// System.out.println(r1);
		// System.out.println(r2);

		// ArrayList<String> res = Anagrams.getAnagrams("cat");
		// System.out.println(res);
		// char[] input = {'a','b','c'};
		// Anagrams.rotate(input,2);
		// System.out.println(input);
		// System.out.println(res);
		// String[] test1 = new String[]{"4", "13", "5", "/", "+"};
		// int res = ReversePolish.evalRPN(test1);
		// System.out.println(res);
		// String a = "/..//./";
		// String res = SimplifyPath.simplifyPath(a);
		// System.out.println(res);
		// TreeNode t1 = new TreeNode(1);
		// TreeNode t2 = new TreeNode(2);
		// TreeNode t3 = new TreeNode(3);
		// TreeNode t4 = new TreeNode(4);
		// TreeNode t5 = new TreeNode(5);
		// TreeNode t6 = new TreeNode(6);

		// t1.left = t2;
		// t1.right = t3;
		// t2.left = t4;
		// t2.right = t5;
		// t3.right = t6;
		// ArrayList<ArrayList<Integer>> res = BTreeZigTraversal.zigzagLevelOrder(t1);
		// ArrayList<Integer> res = PascalTriangleII.getRow(4);
		// System.out.println(res);
		// char c = 'a';
		// System.out.println((char) (c+1));
		// String a = "0";
		// String b = "10";
		// String res = AddBinary.addBinary(a,b);
		// System.out.println(res);
		// boolean res = ValidParentheses.isValid(a);
		// System.out.println(res);

		// ListNode l1 = new ListNode(1);
		// ListNode l2 = new ListNode(2);
		// ListNode l3 = new ListNode(3);
		// ListNode l4 = new ListNode(4);
		// ListNode l5 = new ListNode(5);

		// l1.next = l2;
		// l2.next = l3;
		// l3.next = l4;
		// l4.next = l5;

		// ReorderList.reorderList(l1);
		// ListNode cur = l1;
		// while (cur != null)
		// // for (int i=0; i<10; i++)
		// {
		// 	System.out.print(cur.val);
		// 	cur = cur.next;
		// }
		// System.out.println();


		// ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(5);

		// ArrayList<ArrayList<Integer>> res = Pascal.generate(15);
		// System.out.println(res);
		// int res = Pascal.kCn(25,2);
		// System.out.println(res);
		// System.out.println(res);
		

		// ListNode res = ReverseLList.reverseBetween(l1,5,5);
		// res.display();

		// String test = "   dog";
		// int res = LengthOfLastWord.lengthOfLastWord(test);
		// System.out.println(res);
		

		// int [] A = {1,1,1,1,3,3};
		// int res = RemoveDupArray2.removeDuplicates(A);
		// System.out.println(res);

		// // int[] A = {1,2,1,0,2,1,1,1,2,0,0,0,1,1,1,1,0,2,0,0,1,0,2,0,0,1,2,1,0};
		// // SortColor.sortColors(A);

		// // // int res = RemoveDupArray.removeDuplicates(A);
		// // // System.out.println(res);
		// for (int i=0; i<res; i++)
		// {
		// 	System.out.print(A[i]);
		// }
		// System.out.println();
		// int[] res = new int[A.length];
		// System.out.println();
		// String s1 = "cbd f d ";
		// System.out.println(s1.substring());
		// System.out.println("1123");
		// String s2 = ReverseWords.reverseWords(s1);
		// System.out.println(s2);

		// ArrayList<ArrayList<Integer>> res = LevelTraversal2.levelOrderBottom(t1);
		// System.out.println(res);
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

		

		// ListNode res = RemoveDupLL.deleteDuplicates(l1);
		// // System.out.println(res);
		// while (res != null)
		// {
		// 	System.out.print(res.val);
		// 	res = res.next;
		// }
		// System.out.println();

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