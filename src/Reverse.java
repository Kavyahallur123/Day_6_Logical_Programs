import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Reverse r=new Reverse();
        r.reverse();

    }

    public void reverse(){
        int a[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Reverse of elements");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
