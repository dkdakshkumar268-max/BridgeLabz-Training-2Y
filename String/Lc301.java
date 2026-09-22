class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0, right = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                left++;
            } else if(c == ')') {
                if(left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        solve(s, 0, left, right, 0, new StringBuilder());
        return ans;
    }

    void solve(String s, int index, int left, int right, int open, StringBuilder cur) {
        if(index == s.length()) {
            if(left == 0 && right == 0 && open == 0) {
                ans.add(cur.toString());
            }
            return;
        }

        char c = s.charAt(index);

        if(c == '(' && left > 0) {
            solve(s, index + 1, left - 1, right, open, cur);
        }

        if(c == ')' && right > 0) {
            solve(s, index + 1, left, right - 1, open, cur);
        }

        cur.append(c);

        if(c != '(' && c != ')') {
            solve(s, index + 1, left, right, open, cur);
        } else if(c == '(') {
            solve(s, index + 1, left, right, open + 1, cur);
        } else if(open > 0) {
            solve(s, index + 1, left, right, open - 1, cur);
        }

        cur.deleteCharAt(cur.length() - 1);
    }
}