import java.util.Scanner;

public class ASCII {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr=new int[n];

    ASCII(){
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void m4(){
        for(int a=0;a<n;a++){
            System.out.println((char)arr[a]);
        }
    }

    public static void main(String[] args) {
        ASCII obj=new ASCII();
        obj.m4();
    }
}
