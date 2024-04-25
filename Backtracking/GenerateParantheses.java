class Solution {
    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses("", 0, 0, n, result);
        return result;
    }

    private void generateParentheses(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParentheses(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generateParentheses(current + ")", open, close + 1, n, result);
        }
    }
}
