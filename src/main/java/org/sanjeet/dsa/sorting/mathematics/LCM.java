package org.sanjeet.dsa.sorting.mathematics;

public class LCM {
    public static void main(String[] args) {
        System.out.println(findLCM(4,6));
        System.out.println(lcmOptimal(4,6));
    }
    //brute force O(n)
    public static int findLCM(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res %a ==0 && res%b==0){
                return res;
            }
            else{
                res++;
            }
        }

    }

    //optimal solution O(log(min(a,b))
    // a*b = gcd(a,b)*lcm(a,b)
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int lcmOptimal(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
