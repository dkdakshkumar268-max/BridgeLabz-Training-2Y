class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '?') {
                for(char c = 'a'; c <= 'z'; c++) {
                    if(i > 0 && arr[i - 1] == c) {
                        continue;
                    }

                    if(i < arr.length - 1 && arr[i + 1] == c) {
                        continue;
                    }

                    arr[i] = c;
                    break;
                }
            }
        }

        return new String(arr);
    }
}