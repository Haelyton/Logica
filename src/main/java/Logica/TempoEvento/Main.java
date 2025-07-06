//import javax.swing.tree.TreeNode;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return null;
//        }
//        return buildBST(nums, 0, nums.length - 1);
//    }
//
//    private TreeNode buildBST(int[] nums, int start, int end) {
//        if (start > end) {
//            return null; // Base case: no elements to form a node
//        }
//
//        int mid = start + (end - start) / 2; // Calculate middle index
//        TreeNode root = new TreeNode(nums[mid]); // Create root node with middle element
//
//        // Recursively build left subtree using the left half of the array
//        root.left = buildBST(nums, start, mid - 1);
//
//        // Recursively build right subtree using the right half of the array
//        root.right = buildBST(nums, mid + 1, end);
//
//        return root;
//    }
//}
