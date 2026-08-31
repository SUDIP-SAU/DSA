class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode temp = stack.pop();

            if (temp.right != null)
                stack.push(temp.right);

            if (temp.left != null)
                stack.push(temp.left);

            result.add(temp.val);
        }

        return result;
    }
}