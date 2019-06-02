package _98_validBST;

/**
 * 1.如果是null，则满足二叉搜索树
 * 2.
 * 递归
 * 左子树的所有节点小于传入的最大值
 * 右子树的所有节点大于传入的最小值
 * max > validate(node.left)
 * min < validate(node.right)
 * 递归
 */
class Solution2 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }

    public boolean isValid(TreeNode root, Integer max, Integer min){
        if(root == null){
            return true;
        }
        if(max != null && root.val >= max){
            return false;
        }
        if(min != null && root.val <= min){
            return false;
        }
        return isValid(root.left,root.val,min)
                && isValid(root.right,max,root.val);
    }
}
