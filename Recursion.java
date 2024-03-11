//3/11/2024 1836 - This is the first block of code that I wrote using my knowledge of a subject like recursion, my knowledge of GitHub Copilot and sat in front of the students. Everything below this is what I did in class.


// create code in java that illustrates recursion, use a simple version of Euclid's algorithm to find the greatest common divisor of two numbers
// The greatest common divisor of two positive integers is the largest integer that divides both of them without leaving a remainder
// For example, the greatest common divisor of 8 and 12 is 4

// define recursion:
// Recursion is a process in which a method calls itself continuously until a base case is reached (or satisfied) 
// A base case is a condition where the recursion ends. It is the condition where the recursion stops. Once the base case is reached, the method will stop calling itself.

public class Recursion {
    public static void main(String[] args) {
        // test the algorithm
        System.out.println(gcd(8, 12)); // 4
    }

    // recursive method to find the greatest common divisor
    public static int gcd(int a, int b) {
        if (b == 0) { // base case
            return a;
        }
        return gcd(b, a % b); // recursive call (if base case is not satisfied)
    }
}
