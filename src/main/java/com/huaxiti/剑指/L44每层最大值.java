package com.huaxiti.剑指;

import java.util.ArrayList;
import java.util.List;

public class L44每层最大值 {
    public List<Integer> largestValues(TreeNode root) {
        List<TreeNode> l1 = new ArrayList<TreeNode>();
        l1.add(root);
        List<TreeNode> l2 = new ArrayList<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        result.add(root.val);
        while (root.left != null || root.right != null) {
            for (TreeNode node : l1) {
                l2.add(node.left);
                l2.add(node.right);
            }
            int max = 0;
            for (TreeNode node : l2) {
                max = Math.max(max, node.val);
            }
            result.add(max);
            l1 = l2;
            l2.clear();
        }
        return result;
    }
}
