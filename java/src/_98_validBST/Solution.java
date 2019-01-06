package _98_validBST;

import java.util.List;
import java.util.ArrayList;

/**
 * 二叉搜索树，用中序遍历的话，能得出一个递增序列，
 * 所以判断序列是不是递增的就行。
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        LDR(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void LDR(TreeNode root){
        if(root.left != null){
            LDR(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            LDR(root.right);
        }
    }
}