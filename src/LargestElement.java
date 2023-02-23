public class LargestElement {
    public static void main(String[] args) {
        LargestElement l=new LargestElement();
        l.largestElement();
    }

    public void largestElement(){
        int a[]={10,2,9,70,50,90,50,200};int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
