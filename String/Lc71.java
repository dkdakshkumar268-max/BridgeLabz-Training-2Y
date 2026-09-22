class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for(String part : parts) {
            if(part.equals("") || part.equals(".")) {
                continue;
            }

            if(part.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        StringBuilder ans = new StringBuilder();

        for(String part : stack) {
            ans.append("/").append(part);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}