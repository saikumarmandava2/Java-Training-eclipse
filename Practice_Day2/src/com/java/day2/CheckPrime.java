package com.java.day2;

public class CheckPrime {
    
    public void isPrime(int n) {
        boolean isPrime = true;
        
        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        CheckPrime obj = new CheckPrime();
        obj.isPrime(n);
    }
}
