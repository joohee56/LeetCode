/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;
import java.math.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=null;
        
        String value1 = "";
        for(ListNode tmp = l1; tmp != null; tmp = tmp.next) {
            value1 = tmp.val + value1;
        }
        
        String value2 = "";
        for(ListNode tmp = l2; tmp != null; tmp = tmp.next) {
            value2 = tmp.val + value2;
        }
        
        String res = String.valueOf(new BigInteger(value1).add(new BigInteger(value2)));
        
        for(int i=0; i<res.length(); i++) {
            System.out.println(res.charAt(i)); 
            ans = new ListNode((int)(res.charAt(i)-'0'), ans);
        }
        
        return ans;
        
    }
}