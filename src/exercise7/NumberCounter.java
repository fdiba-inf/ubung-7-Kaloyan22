package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int Count = input.nextInt();

        int[] numbers = new int[Count];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberOfOccurrences = 0; 
        System.out.println("Number occurrences: " + countNumberOccurrences(number, numbers));
    }

    public static int countNumberOccurrences(int num, int[] numbers) {
      int count=0;
          for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num){
              count++;
            }
          }
        return count;
    }
}
