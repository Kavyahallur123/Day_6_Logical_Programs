import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Avarage avg=new Avarage();
        avg.ava();


    }

    public void ava(){
        int a[]=new int[3];int sum=0;int avarage;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter array numbers");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();

        }
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        avarage=sum/a.length;
        System.out.println(avarage);




    }
}
