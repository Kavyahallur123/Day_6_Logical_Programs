public class PrimeNum {
    public static void main(String[] args) {

//        for (int no=2;no<=100;no++){
//            int temp=0;
//            for (int i=2;i<no-1;i++){
//                if (no%i==0){
//                    temp++;
//                }
//            }
//            if (temp==0){
//                System.out.println(no);
//            }

        for (int i=2;i<=100;i++){
            int temp=0;
            for (int j=2;j<=i-1;j++){
                if (i%j==0){
                    temp++;

                }
            }
            if (temp==0){
                System.out.println(i);
            }

        }
    }
}
