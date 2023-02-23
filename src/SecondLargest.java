public class SecondLargest {
    public static void main(String[] args) {
        SecondLargest s=new SecondLargest();
        s.secondLargest();

    }
    public  void secondLargest(){
        int a[]={10,20,92,8,74,9};
        int temp;
        for (int i=0;i<a.length;i++){
         for (int j=i+1;j<a.length;j++){
             if (a[i]>a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
        }
        System.out.println(a[1]);
    }
}
