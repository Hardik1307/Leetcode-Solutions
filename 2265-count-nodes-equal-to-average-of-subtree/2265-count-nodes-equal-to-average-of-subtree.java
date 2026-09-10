/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count =0;
 
    
    public int avg(TreeNode root){

        if(root==null) return 0;

        count++;
        int left  = avg(root.left);
        int right = avg(root.right);
        return left + right + root.val;
        
    }

    
    public int averageOfSubtree(TreeNode root) {
        int valid = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int val = curr.val;

            int average = avg(curr)/count;
            if(average == val) valid++;
            count =0;


            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
        }

        return valid;

    }
}