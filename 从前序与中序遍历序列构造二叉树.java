/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Map<Integer, Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<>();
        for(int i =0;i<n;i++){
            indexMap.put(inorder[i],i);
        }
        return buildTree(preorder,0,n-1,inorder,0,n-1);
    }
    public TreeNode buildTree(int[] preorder,int preorder_left,int preorder_right,int[] inorder,int inorder_left,int inorder_right){
        if(preorder_left>preorder_right){
            return null;
        }
        //ǰ���һ���ڵ���Ǹ��ڵ�
        int preorder_root = preorder_left;
        //���������ҵ����ڵ��λ��
        int inorder_root = indexMap.get(preorder[preorder_root]);

        //�������ڵ�
        TreeNode root = new TreeNode(preorder[preorder_root]);
        //��ȡ���ڵ��������Ľڵ���Ŀ
        int size_left_subtree = inorder_root - inorder_left;
        root.left = buildTree(preorder,preorder_left+1,preorder_left+size_left_subtree,inorder,inorder_left,inorder_root-1);
        root.right = buildTree(preorder,preorder_left+size_left_subtree+1,preorder_right,inorder,inorder_root+1,inorder_right);
        return root;
    }
}