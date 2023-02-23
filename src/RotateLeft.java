public class RotateLeft {
    public static void main(String[] args) {
        RotateLeft rotateLeft=new RotateLeft();
        rotateLeft.rotateLeft();

    }

    public void rotateLeft(){
        int a[]={1,2,3,4,5,6,7,};//{
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int first =a[0];
        for (int j=0;j<a.length-1;j++){
            a[j]=a[j+1];

        }
        a[a.length-1]=first;
        System.out.println("Op array");

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
