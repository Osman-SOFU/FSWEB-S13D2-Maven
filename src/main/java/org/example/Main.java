package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int inputNumber) {
        // Sayının mutlak değerini alıyoruz
        inputNumber = Math.abs(inputNumber);

        char[] arr = String.valueOf(inputNumber).toCharArray();

        // O(n/2) -> O(n)
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int n)
    {
        // 1 is not a perfect number
        if (n <= 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }

    public static String numberToWords(int number) {
        String[] zeroToNine = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // Eğer sayı negatifse, "Invalid Value" döneriz
        if (number < 0) {
            return "Invalid Value";
        }

        // Sayıyı stringe çeviriyoruz
        String numStr = String.valueOf(number);
        StringBuilder words = new StringBuilder();

        // Her bir karakteri kontrol edip karşılık gelen kelimeyi buluyoruz
        for (char c : numStr.toCharArray()) {
            if (c == '0') {
                words.append(zeroToNine[0]).append(" ");
            } else {
                words.append(zeroToNine[c - '0']).append(" ");
            }
        }

        // Sondaki boşluğu silerek string'i döndürüyoruz
        return words.toString().trim();
    }
}
