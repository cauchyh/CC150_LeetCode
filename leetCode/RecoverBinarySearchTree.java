/*
	Two elements of a binary search tree (BST) are swapped by mistake.

	Recover the tree without changing its structure.

	Note:
	A solution using O(n) space is pretty straight forward. 
	Could you devise a constant space solution?
	confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
*/

public class RecoverBinarySearchTree 
{
	public void recoverTree(TreeNode root) 
    {
        ArrayList<TreeNode> nodesInorder = new ArrayList<TreeNode>();
        TreeNode firstNode = root;
        TreeNode secondNode = root;
        nodesInorder = inorderTraversal(root);
        for (int i=1; i<nodesInorder.size(); i++) {
            if (nodesInorder.get(i).val < nodesInorder.get(i-1).val) {
                firstNode = nodesInorder.get(i-1);
                break;
            }
        }
        for (int i=nodesInorder.size()-2; i>=0; i--) {
            if (nodesInorder.get(i).val > nodesInorder.get(i+1).val) {
                secondNode = nodesInorder.get(i+1);
                break;
            }
        }
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }
    
    private ArrayList<TreeNode> inorderTraversal(TreeNode root) 
    {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        // stack.push(root);
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur);
                cur = cur.right;
            }
        }
        return res;
    }
}