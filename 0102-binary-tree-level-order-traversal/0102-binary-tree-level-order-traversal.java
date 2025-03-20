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
    public List<List<Integer>> levelOrder(TreeNode root) {
        

        List<List<Integer>>ans =new ArrayList<>();
       

        
        Queue<TreeNode>q=new ArrayDeque<>();
        
       if(root==null){
        return ans;
       }
        q.add(root);

        while(q.size()!=0){
           List<Integer>curLevel=new ArrayList<>();

            
            int size=q.size();

            for(int i=0;i<size;i++){
             TreeNode cur=q.remove();
             curLevel.add(cur.val);

             if(cur.left!=null){
                q.add(cur.left);
             }
             if(cur.right!=null){
                q.add(cur.right);
             }

            }
            ans.add(curLevel);
            

        }

        return ans;
    }
}