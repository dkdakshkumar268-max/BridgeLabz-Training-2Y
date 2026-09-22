class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for(int i = 1; i <= n / 2; i++) {
            if(num.charAt(0) == '0' && i > 1) break;

            for(int j = i + 1; j < n; j++) {
                if(num.charAt(i) == '0' && j - i > 1) break;

                String a = num.substring(0, i);
                String b = num.substring(i, j);

                if(check(num, j, a, b)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean check(String num, int index, String a, String b) {
        while(index < num.length()) {
            String sum = add(a, b);

            if(!num.startsWith(sum, index)) {
                return false;
            }

            index += sum.length();
            a = b;
            b = sum;
        }

        return true;
    }

    String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if(i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if(j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}