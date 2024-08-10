package org.sanjeet.dsa.sorting.mathematics;

public class GCD {

    public static void main(String[] args) {
        System.out.println(getGCD(4,6));
        System.out.println(getGCDEfficient(4,6));
        System.out.println(getGCDOptimal(4,6));
    }
    //brute force O(min(a,b))
    public  static int getGCD(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a% res ==0 && b%res == 0){
                return res;
            }
            else{
                res--;
            }
        }
        return res;
    }

    //efficient solution
    //Euclidian Algorithm gcd(a,b) = gcd(a-b,b)

    public static int getGCDEfficient(int a,int b){
        while(a!=b){
            if (a>b)
                a = a-b;
            else b = b-a;
        }
        return a;
    }
    //optimal solution O(log(min(a,b)))
    public static int getGCDOptimal(int a,int b){
       if(b==0){
           return a;
       }
       else {
           return getGCDOptimal(b,a%b);
       }
    }
}
