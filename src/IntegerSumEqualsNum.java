public class IntegerSumEqualsNum {
    public static void main(String[] args) {
        IntegerSumEqualsNum Obj=new IntegerSumEqualsNum();
        Obj.integerSum();

    }
    public void integerSum(){
        int num=10;int temp;
        int a[]={5,5,6,4,3,7,8,2,1};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==num){
                    System.out.println(a[i]+" "+a[j]);


                }
            }
        }
    }

}
