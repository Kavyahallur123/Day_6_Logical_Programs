import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        ///---------sort array in ascending order-------------------

//        int a[]={36,19,88,5,6,99};
//        int temp;
//        for (int i=0;i< a.length;i++){
//            for (int j=i+1;j<a.length-1;j++){
//                if (a[i]>a[j+1]){
//                    temp=a[i];
//                    a[i]=a[j+1];
//                    a[j+1]=temp;
//
//                }
//
//            }
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
////

        //---------------------------------------------------------------------------------------------------------

//        String a[]={"rani","pajju","pammu","baby","chandru"};
//        String temp;
//        for (int i=0;i< a.length;i++){
//            for (int j=i+1;j< a.length-1;j++){
//                if (a[i].compareTo(a[j+1])>0){
//                    temp=a[j];          // temp=a[i];
//                    a[j]=a[j+1];       //  a[i]=a[j+1];
//                    a[j+1]=temp;      //  a[j+1]=temp;
//
//                }
//            }
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//------------------------------------------------------------------------------------------------------------------

//
//        Scanner scanner=new Scanner(System.in);
//        int a[]=new int[5];        int temp;
//
//        System.out.println("ENTER ARRAY");
//
//        for (int i=0;i< a.length;i++){
//             a[i]=scanner.nextInt();
//        }
//
//        System.out.println("Array elements are: ");
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//
//        System.out.println("================Sorted elements are==========================");
//        for (int i=0;i< a.length;i++){
//            for (int j=0;j<a.length-1;j++){
//                if (a[i]>a[j]){
//
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//
//
//                }
//
//            }
//
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
////
////

        //Toprint number of elements in array

//        int a[]={80,50,77,99,52};
//        System.out.println(a.length);


        //Calculate avarage of anumbers--
//        int a[] = new int[3];
//        int sum = 0;
//        int avg;
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter array elements");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = s.nextInt();
//
//        }
//        System.out.println("array elements are:-");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//
//        }
//
//        //1+2+4+5+6+7/n
//
//        for (int i = 0; i < a.length; i++) {
//            sum = sum + a[i];
//
//        }
//        System.out.println(sum+ "sum");


        //to reverse an arry elements


//        int a[]=new int[5];
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter array elements");
//        for (int i=0;i<5;i++){
//            a[i]=scanner.nextInt();
//        }
//
//        System.out.println("Array elements are---");
//        for (int i=0;i<5;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println("Reverse elements are");
//
//        for (int i=4;i>=0;i--){
//            System.out.println(a[i]);
//        }

        //To sort an array in ascending order

//        int a[]=new int[5];int temp;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter arry elements");
//
//        for (int i=0;i<a.length;i++){
//            a[i]=s.nextInt();
//        }
//
//        System.out.println("Array elements are");
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//
//        System.out.println("Elements in ascending order");
//
//        for (int i=0;i<a.length;i++){
//           for (int j=i+1;j<a.length;j++){
//               if (a[i]<a[j]){
//                   temp=a[i];
//                   a[i]=a[j];
//                   a[j]=temp;
//               }
//           }
//            System.out.println(a[i]);
//
//        }

        //to convert char to string array

//        char[] ch= new char[]{'a', 'b', 'c'};
//        String s=new String(ch);
//        System.out.println(s);
//

        //-------------------------------------------------------------------------
        //elements present on odd position

//        int a[]={55,66,99,22,33,10,200};
//        for (int i=2;i<a.length;i=i+2){
//            System.out.println(a[i]);
//
//        }


        //-----------------------------copy all the elements of array into other
//        int a[]=new int[5];
//        int b[]=new int[a.length];
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter array elements");
//        for (int i=0;i< a.length;i++){
//            a[i]=scanner.nextInt();
//
//        }
//        System.out.println("Array elements are");
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println("Copying elements of a to b array");
//        for (int i=0;i< a.length;i++){
//           b[i]=a[i];
//            System.out.println(b[i]);
//
//        }

        //To count the frequency of each element in array

//        int a[]={2,2,3,5,8,5,9,7,7,1};
//        int visitedArr[]=new int[a.length];
//        int visited=-1;//this means ,this element is alredy ocurred in the array
//
//        for (int i=0;i<a.length;i++){
//            int count=0;
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]==a[j]){
//                    count++;
//                    visitedArr[j]=visited;//if the match is found we make this jth array as visited
//                }
//
//            }
//            //if any i elements is not visited in this eg. 1st element make that element count i.e count =1;
//            if (visitedArr[i]!=visited){
//                visitedArr[i]=count;
//
//            }
//        }
//        for (int i=0;i<visitedArr.length;i++){
//            if (visitedArr[i]!=visited){
//                System.out.println("Frequency of  "+a[i]+ " is " +visitedArr[i]);
//            }
//        }


//        int a[] = {2, 3, 5, 8, 9, 17, 5, 8,5,2};
//        int visitedArr[] = new int[a.length];
//        int visited = -1;
//
//        for (int i = 0; i < a.length; i++) {
//            int count = 0;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    count++;
//                    visitedArr[j] = visited;
//                }
//            }
//            if (visitedArr[i] != visited) {
//                visitedArr[i] = count;
//            }
//        }
//
//        for (int i = 0; i < visitedArr.length; i++) {
//            if (visitedArr[i] != visited) {
//
//                System.out.println("Frequency of " + a[i] + " is " + visitedArr[i]);
//            }
//
//        }

        //Duplicate element
//        int a[]=new int[6];
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter array elements");
//        for (int i=0;i<a.length;i++){
//            a[i]=s.nextInt();
//        }
//        System.out.println("Array elements");
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        System.out.println("Duplicate elements ");
//        for (int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]==a[j]){
//                    System.out.println(a[i]);
//                }
//            }
//        }
//

        //-------------------LArgest element
//
//        int a[]=new int[4];
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter array elements");
//
//        for (int i=0;i<a.length;i++){
//            a[i]=s.nextInt();
//        }
//        int max=a[0];
//        for (int i=0;i<a.length;i++){
//            if (a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println("max element "+max);

        //---------------remove duplicate
//
//        int a[]={1,2,2,3,4,5,6,6};
//
//
//        int temp[]=new int[a.length];
//        int j;
//        for (int i=0;i<a.length;i++){
//            for ( j=i+1;j<a.length-1;j++){
//
//                if (a[i]!=a[i+1]){
//                    temp[j]=a[i];
//                    j++;
//                }
//
//            }
//            temp[j]=a[a.length-1];
//            for ( i=0;i< temp.length;i++){
//                System.out.println(temp[i]);
//            }
//        }


        //--------------convert byte array to string----

//        char ch[]={'C','o','o','l'};
//        String s=String.valueOf(ch);
//        System.out.println(s);
//

        //--------------integer sum=given num-------

        int a[]={5,1,2,6,7,-1,3,3,4};
        int sum=6;

        for (int i=0;i<a.length;i++){

            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==sum){

                    System.out.println(a[i]+" "+a[j]);
                }
            }

        }
    }
}
