class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] minutes = new boolean[1440];

        for(String time : timePoints) {
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3, 5));

            int total = hour * 60 + minute;

            if(minutes[total]) {
                return 0;
            }

            minutes[total] = true;
        }

        int first = -1;
        int previous = -1;
        int ans = 1440;

        for(int i = 0; i < 1440; i++) {
            if(minutes[i]) {
                if(first == -1) {
                    first = i;
                }

                if(previous != -1) {
                    ans = Math.min(ans, i - previous);
                }

                previous = i;
            }
        }

        ans = Math.min(ans, first + 1440 - previous);

        return ans;
    }
}