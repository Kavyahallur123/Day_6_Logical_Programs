import java.util.HashSet;

public class LengthOfLongestConsecutiveSeq {
    public static void main(String[] args) {
        LengthOfLongestConsecutiveSeq l=new LengthOfLongestConsecutiveSeq();
        l.lengthOfLongestConsecutiveSeq();

    }
    static void lengthOfLongestConsecutiveSeq(){
        int a[]={10,20,8,7,9,13,15,14};
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int i=0;i< a.length;i++){
            hashSet.add(a[i]);

        }
        int longLengh=0;
        for (int i=0;i< a.length;i++){
            if (!hashSet.contains(a[i]-1)){
                int no=a[i];
                while (hashSet.contains(no)){
                    no++;
                }
                if (longLengh<no-a[i]){
                    longLengh=no-a[i];
                }

            }

        }
        System.out.println("Largest sub sequence element is "+longLengh);
    }

}
