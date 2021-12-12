import java.util.Scanner;

public class ArrayCheck {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int b;
    int a;

    ArrayCheck() {
         b = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public int m3() {
        for (a = 0; a < n; a++) {
            if (b == arr[a])
                return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayCheck obj = new ArrayCheck();
        System.out.println(obj.m3());
    }
}




