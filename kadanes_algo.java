// Java program to print largest contiguous array sum
import java.util.Scanner;

class tangorishi
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int max_so_far = a[0];
    int curr_max = a[0];
    for (int i = 1; i < n; i++) {
      curr_max = Math.max(a[i], curr_max + a[i]);
      max_so_far = Math.max(max_so_far, curr_max);
    }
    System.out.println("The largest contiguous sum is " + max_so_far);
  }
}

