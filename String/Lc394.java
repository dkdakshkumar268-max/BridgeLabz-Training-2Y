class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if(c == '[') {
                countStack.push(count);
                stringStack.push(current);
                count = 0;
                current = "";
            } else if(c == ']') {
                int n = countStack.pop();
                String previous = stringStack.pop();

                String temp = "";
                for(int j = 0; j < n; j++) {
                    temp += current;
                }

                current = previous + temp;
            } else {
                current += c;
            }
        }

        return current;
    }
}