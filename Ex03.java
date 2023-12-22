public class Ex03{
    public static void main(String[] args){
        int num = 12;
        int den = 0;
        try{
            if (den == 0){
                throw new ArithmeticException(" 除數為0");}
            else{
                int ans = num / den;
                System.out.println("ans = " + ans);}
        }catch(ArithmeticException e){
            System.out.println("Catch ArithmeticException" + e.getMessage());
        } finally{
            System.out.println("Finally block executed");
        }
    }
    }
