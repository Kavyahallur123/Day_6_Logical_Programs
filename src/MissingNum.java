public class MissingNum {
    public static void main(String[] args) {
        MissingNum m=new MissingNum();
        m.missingNum();

    }

    public void missingNum(){
        int a[]={1,2,3,4,6};int sum=0;
        int  naturalElemnts=a.length+1;
        int totalSum=naturalElemnts*(naturalElemnts+1)/2;
//        System.out.println(totalSum);
        for (int i=0;i<a.length;i++){
             sum=sum+a[i];
        }
        System.out.println("missing number is "+(totalSum-sum));



    }
}
