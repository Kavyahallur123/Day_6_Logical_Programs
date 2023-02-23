public class Frequency {
    public static void main(String[] args) {
        Frequency f=new Frequency();
        f.frequencyOfEachELement();

    }

    public void frequencyOfEachELement(){
        int a[]={1,2,9,8,6,7,9,8,2,8};
        int visitedArr[]=new int[a.length];
        int visited=-1;

        for (int i=0;i<a.length;i++){
            int temp=1;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    temp++;
                    visitedArr[j]=visited;

                }

            }
            if (visitedArr[i]!=visited){
                visitedArr[i]=temp;
            }
        }
        for (int i=0;i<visitedArr.length;i++){
            if (visitedArr[i]!=visited){
                System.out.println("Frequency of "+a[i]+ " is "+visitedArr[i]);
            }
        }

    }
}
