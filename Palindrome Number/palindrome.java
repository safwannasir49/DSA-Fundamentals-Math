class Solution {
    public boolean isPalindrome(int n) {
        int reverse =0,digit;
        int original = n;
        while(n!=0)
        {
            digit = n%10;
            reverse = (reverse*10) + digit;
            n=n/10;
        }
        if(reverse==original && reverse>=0)
        {
            return true;
        }
        return false;
    }
}
