class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        
        int res1=0, res2=0;
        for(int i=0; i<s.length(); i++) {
            if(i+1 < s.length()) {
                res1 = getNumberic(s.charAt(i));
                res2 = getNumberic(s.charAt(i+1));
                
                if(res2 > res1) {
                    ans += (res2 - res1);
                    i++;
                } else {
                    ans += res1;
                }
            } else {
                ans += getNumberic(s.charAt(i));
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