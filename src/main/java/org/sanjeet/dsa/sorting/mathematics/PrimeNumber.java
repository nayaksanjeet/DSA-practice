package org.sanjeet.dsa.sorting.mathematics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(125));
        System.out.println(isPrimeEfficient(125));
        System.out.println(isPrimeOptimal(125));
    }
    //brute force O(n)
    public static boolean isPrime(int n){
        if(n ==1 ){
            return false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    //Efficient Solution O((n^(1/2))
    public static boolean isPrimeEfficient(int n){
        if(n ==1)
            return false;
        for(int i =2;i*i<=n;i++){
            if(n%i ==0)
                return false;
        }
        return true;
    }

    //optimal Solution
    public static boolean isPrimeOptimal(int n){
        if(n==1)
            return false;
        else if(n==2 || n==3)
            return true;
        else if(n%2 ==0 || n%3 == 0)
            return false;
        else{
            for(int i =5;i*i<=n;i=i+6){
                if(n%i ==0 || n%(i+2) ==0)
                    return false;
            }
            return true;
        }
    }
}
