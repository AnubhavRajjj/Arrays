import java.util.Scanner;

public class True {
    int flag=0;
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[]arr=new int[n];

    True(){
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void m1(){
        for(int a=0;a<n;a++){
            if(arr[a]==1 || arr[a]==4) {
                flag = 1;

            }
            else {
                flag = 0;
                break;
            }

        }
        if(flag==1)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        True obj = new True();
        obj.m1();
    }
}
