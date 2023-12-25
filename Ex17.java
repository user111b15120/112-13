import java.util.Scanner;

class IntegerlessThanZero extends Exception{
    public IntegerlessThanZero(String message){
        super(message);
    }
}

class IntegerGreatetThanZero extends Exception{
    public IntegerGreatetThanZero(String message){
        super(message);
    }
}

class IntegerEqualThanZero extends Exception{
    public IntegerEqualThanZero(String message){
        super(message);
    }
}

public class Ex17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("請輸入一整數");
                int input = scanner.nextInt();
                checkInteger(input);
            } catch (IntegerlessThanZero e){
                System.out.println(e.getMessage() + " 0");
            } catch (IntegerGreatetThanZero e){
                System.out.println(e.getMessage() + " 0");
            } catch (IntegerEqualThanZero e){
                System.out.println(e.getMessage());
            }
            scanner.close();
    }

    static void checkInteger(int value) throws IntegerlessThanZero, IntegerGreatetThanZero, IntegerEqualThanZero{
        if (value < 0){
           throw new IntegerlessThanZero("您輸入的整數的值小於"); 
        } else if (value > 0){
            throw new IntegerGreatetThanZero("您輸入的整數的值大於");
        } else {
            throw new IntegerEqualThanZero("您輸入的整數的值為" + value);
        }
    }
}
