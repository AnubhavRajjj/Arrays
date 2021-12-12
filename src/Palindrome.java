import java.util.Scanner;

public class Palindrome{
    int flag=0;
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr=new int[n];

    Palindrome(){
        for(int i=0;i<n;i++){
        Scanner sc=new Scanner(System.in);
        arr[i]=sc.nextInt();
    }

    }
    public void m2(){
        for(int i=0;i<=n/2 && n!=0;i++){
            if(arr[i]!=arr[n-i-1]){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.m2();
    }

}
