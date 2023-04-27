class Solution {
    public int romanToInt(String s) {
        int[] res = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
            char alpha = s.charAt(i);
            res[i] = getNumberic(alpha);
        }

        int ans = 0;
        for(int i=0; i<res.length; i++) {
            if((i+1)<res.length && res[i+1] > res[i]) {
                ans += res[i+1] - res[i];
                i++;
            }
            else {
                ans += res[i];
            }
        }


        return ans;
    }

    static int getNumberic(char c) {
        switch(c) {
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return -1;
        }
    }
}