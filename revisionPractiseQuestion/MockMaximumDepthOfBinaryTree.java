import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class MockMaximumDepthOfBinaryTree {


    public class TreeNode {
        public long val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode next;
    
        public TreeNode (long x) {
            val = x;
            left = null;
            right = null;
            next = null;
        }
    }
    

    static int maximumDepthOfBinaryTree(TreeNode root) {
           
        
        return 0;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 0; test < T; test++) {
            TreeNode root = TreeNode.readTreeReturnRoot(sc);
            int result = maximumDepthOfBinaryTree(root);
            System.out.println(result);
        }
    }
}
