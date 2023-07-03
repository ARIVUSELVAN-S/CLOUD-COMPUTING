import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+"th element");
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}