import java.util.ArrayList;
import java.util.function.Predicate;
public class GenericCounter {
// Method to count elements based on a property using Predicate
public static <T> int countByProperty(ArrayList<T> list, Predicate<T> property) {
int count = 0;
for (T element : list) {
if (property.test(element)) {
count++;
}
}
return count;
}
// Helper method to check if a number is even
public static boolean isEven(Integer num) {
return num % 2 == 0;
}
// Helper method to check if a number is odd
public static boolean isOdd(Integer num) {
return num % 2 != 0;
}
// Helper method to check if a number is prime
public static boolean isPrime(Integer num) {
if (num < 2) return false;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) return false;
}
return true;
}
// Helper method to check if a number is a palindrome
public static boolean isPalindrome(Integer num) {
String str = num.toString();
int len = str.length();
for (int i = 0; i < len / 2; i++) {
if (str.charAt(i) != str.charAt(len - 1 - i)) {
return false;
}
}
return true;
}
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
// Sample list of numbers
numbers.add(121);
numbers.add(131);
numbers.add(4);
numbers.add(7);
numbers.add(23);
numbers.add(44);
numbers.add(56);
// Counting even numbers
int evenCount = countByProperty(numbers, GenericCounter::isEven);
System.out.println("Even numbers count: " + evenCount);
// Counting odd numbers
int oddCount = countByProperty(numbers, GenericCounter::isOdd);
System.out.println("Odd numbers count: " + oddCount);
// Counting prime numbers
int primeCount = countByProperty(numbers, GenericCounter::isPrime);
System.out.println("Prime numbers count: " + primeCount);
// Counting palindrome numbers
int palindromeCount = countByProperty(numbers, GenericCounter::isPalindrome);
System.out.println("Palindrome numbers count: " + palindromeCount);
}
}