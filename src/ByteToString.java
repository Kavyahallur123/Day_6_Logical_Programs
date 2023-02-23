public class ByteToString {
    public static void main(String[] args) {
        ByteToString obj= new ByteToString();
        obj.byteToChar();

    }
    public static void byteToChar(){

    char[] ch= new char[]{'f', 'a', 'm'};
    String s=new String(ch);
    System.out.println(s);
    }
}

