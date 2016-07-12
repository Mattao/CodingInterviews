/**
 *	输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *	假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *	例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 *	则重建二叉树并输出它的后序遍历序列。(测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
 *
 *	Author: matao
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class ConstructBinaryTree {
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    	if(pre == null || in == null) {
    		return null;
    	}
    	if(pre.length != in.length) {
    		return null;
    	}
    	return reConstructBinaryTreeHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public static TreeNode reConstructBinaryTreeHelper(int[] pre, int[] in, int preStart,
    	int preEnd, int inStart, int inEnd) {
    	TreeNode root = new TreeNode(pre[preStart]);
    	root.left = null;
    	root.right = null;

    	if(preStart == preEnd && inStart == inEnd) {
    		return root;
    	}
    	int rootInorder = 0;
    	for (rootInorder = inStart; rootInorder <= inEnd; rootInorder++) {
    		if (in[rootInorder] == root.val) {
    			break;
    		}
    	}

    	if (rootInorder == inEnd && in[rootInorder] != root.val) {   //in中不存在root结点，即in数组错误
    		return null;
    	}

    	int leftLength = rootInorder - inStart;
    	int rightLength = inEnd - rootInorder;
    	if (leftLength > 0) {
    		root.left = reConstructBinaryTreeHelper(pre, in, preStart + 1, preStart + leftLength, inStart, rootInorder - 1);
    	}
    	if(rightLength > 0) {
    		root.right = reConstructBinaryTreeHelper(pre, in, preStart + 1 + leftLength, preEnd, rootInorder + 1, inEnd);
    	}

    	return root;
    }

    public static void main(String[] args) {
    	int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
    	int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
    	TreeNode root = reConstructBinaryTree(pre, in);

    	preTraverse(root);
    	System.out.println();

    	inTraverse(root);
    	System.out.println();
    }

    public static void preTraverse(TreeNode root) {
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.val + " ");
    	preTraverse(root.left);
    	preTraverse(root.right);
    }

    public static void inTraverse(TreeNode root) {
    	if(root == null) {
    		return;
    	}
    	inTraverse(root.left);
    	System.out.print(root.val + " ");
    	inTraverse(root.right);
    }
}
