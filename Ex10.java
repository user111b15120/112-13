public class Ex10 {
    public static void main(String[] args) {
        try{
            Test.test(0, 0);
        } catch (ArithmeticException e){
            System.out.println("捕捉到ArithmeticException例外" + e.getMessage());
        }
    }
}

class Test {
    static void test(int num, int den) {
        System.out.println(num + "/" + den + "=" + num / den);
    }
}
