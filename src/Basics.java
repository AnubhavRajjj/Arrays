import java.util.Scanner;

public class Basics{

    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr=new int[n];


    Basics() {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void m1(){
        for(int a=0;a<n;a++){
            System.out.println(arr[a]);
        }
    }

    public static void main(String[] args) {
        Basics obj=new Basics();
        obj.m1();
    }
}