//BINARY TREES:
//1.Level order traversal problem:
//Problem Statement:
//Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]

//Approach : using Level Order Traversal.

//Solution:
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int qlen = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qlen; i++) {
                TreeNode curr = queue.poll();
                row.add(curr.val);
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            ans.add(row);
        }
        return ans;
    }
}

