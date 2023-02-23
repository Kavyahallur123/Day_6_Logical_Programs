import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args) {
        SortAscending sortAscending=new SortAscending();
        sortAscending.sortInAscending();

    }

    public void sortInAscending(){
//        int a[]={5,6,8,23,45,89};
//        int temp;
//        for (int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length-1;j++){
//                if (a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//
//                }
//
//            }
//            System.out.println(a[i]);
//        }
        Scanner s=new Scanner(System.in);
        System.out.println("Array elements");
        int a[]=new int[5];int temp;
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();

        }
        System.out.println("sorted array");
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
            System.out.println(a[i]);
        }
    }

}
