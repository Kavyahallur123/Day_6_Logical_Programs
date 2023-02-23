import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Add add=new Add();
        add.add();

    }

    public void add(){
        int a[]=new int[5];int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        System.out.println(sum);
    }

}
