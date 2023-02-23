public class DuplicateElemnts {
    public static void main(String[] args) {
        DuplicateElemnts d=new DuplicateElemnts();
        d.duplicateElements();

    }

    public void duplicateElements(){
        int a[]={1,2,3,4,3,5,6,1,6,7,7};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }

    }
}
