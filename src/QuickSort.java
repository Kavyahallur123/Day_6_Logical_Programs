import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import static com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray.*;

//low--start index
//high--ending index
//i---it makes space for elemnts which are less than pivot
//initally , i=-1
//travrse through whole array and compare it with pivot
//cnsider .>>>we hv 5 elemnts in which the elemnts are stord like
//_ _ _ _ _ _
//6 3 9 5 2 8
//so, first compare 6 with 8 
//now i makes space for 6 by incresing its value i++ i.e (-1 to 0)
//then it will store value 6 in the 0th index (line no.7) 
//next 3 will be stored
//9 will not be stored as it is greater than pivot value
//thrn i=2; store 5 in the space
//in this way it stores(i) the values which are less than pivot will store in left side and greter values will be tored right side
//2 3 5 6 8 9
public class QuickSort {

    //--partition
    //in this 1st we will taske pivot elemment
    //&i track , how many elements are less than pivot and so it keep track of how many empty spaces should be created
    //&then it can store it letter
    //IN this initiallyno elemengts are present cwhicvh are lesser than pivot


    public  static  int partition(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;

        for (int j=low;j<high;j++){
            if (a[j]<pivot){  //here storing elements which are les than pivot
                i++;

                //swap

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        // to place pivot in right position
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;

    }



    public static void quickSort(int a[],int low,int high){

        if (low<high){               //if low>high we cant apply quicksort to that arr
            int pivotX= partition(a,low,high);//just take one pivot value and arrange it acordingly i.e partition

            quickSort(a, low, pivotX-1);//sorting smaller elements  and storing it before & upto the pivot index -1
            quickSort(a,pivotX+1,high);//again calling method for elements larger than pivot index+1 up to high
        }
        
    }

    

    public static void main(String[] args) {
        int a[]={6,3,9,5,2,8};
        int n =a.length;
        quickSort(a,0,n-1);

        //print

        for (int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        
        
        
    }
    
}
