public class NumberUtilities {

    // 1️⃣ Sum of digits in range
    public static int sumOfDigitsInRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int totalSum = 0;
        for (int i = start; i <= end; i++) {
            int num = i;
            while (num != 0) {
                totalSum += num % 10;
                num /= 10;
            }
        }
        return totalSum;
    }

    // 2️⃣ Count palindromes in range
    public static int isPalindromeInRange(int start, int end, boolean printList) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                count++;
                if (printList) System.out.print(i + " ");
            }
        }
        if (printList) System.out.println();
        return count;
    }

    private static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // 3️⃣ Compare reversals
    public static int compareReversals(int a, int b, boolean display) {
        int revA = reverseNumber(a);
        int revB = reverseNumber(b);
        if (display) {
            System.out.println("Reversed " + a + " → " + revA);
            System.out.println("Reversed " + b + " → " + revB);
        }
        return Math.max(revA, revB);
    }

    private static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // 4️⃣ Count vowels with extras
    public static int countVowels(String text, char[] includeExtra, boolean caseSensitive) {
        if (text == null) return 0;
        String vowels = "aeiou";
        if (!caseSensitive) {
            text = text.toLowerCase();
            vowels = vowels.toLowerCase();
        }

        // Include extra characters
        if (includeExtra != null) {
            for (char c : includeExtra) {
                vowels += caseSensitive ? c : Character.toLowerCase(c);
            }
        }

        int count = 0;
        for (char ch : text.toCharArray()) {
            char check = caseSensitive ? ch : Character.toLowerCase(ch);
            if (vowels.indexOf(check) >= 0) count++;
        }
        return count;
    }

    // 5️⃣ BMI Analyzer
    public static String analyzeBMI(String name, double weight, double height, char gender) {
        if (weight <= 0 || height <= 0)
            return name + ": Invalid weight or height";

        double bmi = weight / (height * height);
        String category;

        if (Character.toLowerCase(gender) == 'm') {
            if (bmi < 20) category = "Underweight";
            else if (bmi < 25) category = "Normal";
            else if (bmi < 30) category = "Overweight";
            else category = "Obese";
        } else {
            if (bmi < 19) category = "Underweight";
            else if (bmi < 24) category = "Normal";
            else if (bmi < 29) category = "Overweight";
            else category = "Obese";
        }

        return String.format("%s: BMI = %.1f (%s)", name, bmi, category);
    }

    // 6️⃣ Final grade calculator
    public static String getFinalGrade(String studentName, double assignment, double midterm, double exam) {
        if (assignment < 0 || midterm < 0 || exam < 0 ||
            assignment > 100 || midterm > 100 || exam > 100) {
            return studentName + " - Invalid scores provided.";
        }

        double finalScore = (assignment * 0.3) + (midterm * 0.3) + (exam * 0.4);
        char grade;

        if (finalScore >= 85) grade = 'A';
        else if (finalScore >= 75) grade = 'B';
        else if (finalScore >= 65) grade = 'C';
        else if (finalScore >= 50) grade = 'D';
        else grade = 'F';

        return String.format("%s - Final Score: %.1f (Grade %c)", studentName, finalScore, grade);
    }

    // 7️⃣ Prime analysis in range
    public static int analyzePrimesInRange(int start, int end, boolean showSum, boolean showCount) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int count = 0, sum = 0;
        System.out.print("Primes: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println();
        if (showSum) System.out.println("Sum of primes: " + sum);
        if (showCount) System.out.println("Total primes: " + count);
        return count;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 8️⃣ LCM of three numbers
    public static int findLCMofThree(int a, int b, int c, boolean detailed) {
        int gcdAB = findGCD(a, b);
        int lcmAB = (a * b) / gcdAB;
        int gcdABC = findGCD(lcmAB, c);
        int lcmABC = (lcmAB * c) / gcdABC;

        if (detailed) {
            System.out.println("GCD(" + a + "," + b + ") = " + gcdAB);
            System.out.println("LCM(" + a + "," + b + ") = " + lcmAB);
            System.out.println("GCD(" + lcmAB + "," + c + ") = " + gcdABC);
            System.out.println("Final LCM = " + lcmABC);
        }

        return lcmABC;
    }

    private static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 9️⃣ Word counter
    public static int countWords(String sentence, boolean ignoreCase, String excludeWord) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            String w = ignoreCase ? word.toLowerCase() : word;
            String ex = ignoreCase ? excludeWord.toLowerCase() : excludeWord;
            if (!w.equals(ex)) count++;
        }
        return count;
    }

    // 🔟 Armstrong number counter
    public static int countArmstrongNumbers(int start, int end, boolean showNumbers, int power) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i, power)) {
                count++;
                if (showNumbers) System.out.print(i + " ");
            }
        }
        if (showNumbers) System.out.println();
        return count;
    }

    private static boolean isArmstrong(int num, int power) {
        String s = String.valueOf(num);
        int digits = (power > 0) ? power : s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Math.pow(c - '0', digits);
        }
        return sum == num;
    }

    // 🧪 Example usage
    public static void main(String[] args) {
        System.out.println("Sum of digits in range: " + sumOfDigitsInRange(12, 15));
        System.out.println("Palindrome count: " + isPalindromeInRange(10, 200, true));
        System.out.println("Larger reversed: " + compareReversals(123, 456, true));
        System.out.println("Vowels count: " + countVowels("Programming", new char[]{'y'}, false));
        System.out.println(analyzeBMI("John", 70, 1.75, 'M'));
        System.out.println(getFinalGrade("Alice", 85, 70, 90));
        analyzePrimesInRange(10, 50, true, true);
        findLCMofThree(4, 6, 8, true);
        System.out.println("Word count: " + countWords("This is a test sentence", true, "a"));
        System.out.println("Armstrong count: " + countArmstrongNumbers(1, 500, true, 0));
    }
}
/*
 * 
 * Write a method sumOfDigitsInRange(int start, int end) that calculates the total sum of all digits from every number between start and end (inclusive).
If start > end, swap the values.
Example: for range 12 to 15 → (1+2) + (1+3) + (1+4) + (1+5) = 16

 
Write a method isPalindromeInRange(int start, int end, boolean printList) that counts how many palindrome numbers exist between start and end.
If printList is true, print all palindrome numbers found.
Return the total count.

 
Write a method compareReversals(int a, int b, boolean display) that:reverses both numbers,compares which reversed number is larger,prints both reversals if display is true,and returns the larger reversed value.

 
Write a method countVowels(String text, char[] includeExtra, boolean caseSensitive) that:counts all vowels (a, e, i, o, u),optionally includes additional characters
 (e.g., includeExtra = {'y', 'æ'}), respects case sensitivity based on the caseSensitive flag.
 

Write a method analyzeBMI(String name, double weight, double height, char gender) that:
calculates BMI = weight / (height²),
interprets the category differently for male/female,returns a formatted string like "John: BMI = 24.6 (Normal)".
validation: weight and height must be > 0.


Write a method getFinalGrade(String studentName, double assignment, double midterm, double exam) that:
computes weighted average (30% assignment, 30% midterm, 40% exam),
assigns grade (A–F),returns formatted result like "Alice - Final Score: 82.4 (Grade B)".
handles invalid scores (<0 or >100) gracefully.


Write a method analyzePrimesInRange(int start, int end, boolean showSum, boolean showCount) that:
prints all prime numbers between start and end,
optionally prints their sum (showSum) and total count (showCount),
returns the count of prime numbers found.


Write a method findLCMofThree(int a, int b, int c, boolean detailed) that:uses a helper method findGCD(int x, 
int y) for pairwise calculations,calculates LCM of three numbers,if detailed is true, prints each GCD and step used to derive LCM,returns the final LCM value.

 
Write a method countWords(String sentence, boolean ignoreCase, String excludeWord) that:splits the text into words,optionally ignores case,excludes 
any word that matches excludeWord,returns the total count of remaining words.

 
Write a method countArmstrongNumbers(int start, int end, boolean showNumbers, int power) that:
checks all numbers in the range [start, end],determines if each is an Armstrong number based on the given power (default is number of digits),
optionally prints each Armstrong number found, returns the total count.
 */
