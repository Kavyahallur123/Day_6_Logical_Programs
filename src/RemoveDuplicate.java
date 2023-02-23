public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate r=new RemoveDuplicate();
        r.removeDuplicate();

    }
    public void removeDuplicate(){
        int a[]={2,8,9,8,7,6,5,5};

        System.out.println("Array elements");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("removed duplicate elements");

        for (int i=0;i<a.length;i++){
            int count=0;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){

                    count++;
                }
            }if (count==0){
                System.out.println(a[i]);
            }
        }
    }
}
