//2,3,5,7,11,13
//all num-/1 amd itself gives rem 0---------but num 2 indaa divide agii matt n-1 indaa divide agii zeo barutt ala find that

public class PrimeNumbers {
    public static void main(String[] args) {
        int num=7;int temp=0;
        for (int i=2;i<num-1;i++){
            if (num%i==0){
                temp++;

            }
        }
        if (temp>0){
            System.out.println("Notprime num");
        }else {
            System.out.println("Prime num");
        }



        }

}
