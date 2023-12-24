class CenterException extends Exception {
    public CenterException(String Message){
        super(Message);
    }
}

class OutException extends Exception {
    public OutException(String Message){
        super(Message);
    }
}

class InException extends Exception {
    public InException(String Message){
        super(Message);
    }
}

public class Ex12 {
    public static void main(String[] args) {
        try{
            double radious = 10.0;
            double x1 = 5.3;
            double y1 = 6.8;
            double x2 = 0.2;
            double y2 = 9.5;
            double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            if (dist > radious){
                throw new OutException(String.format("(%.1f, %.1f)在半徑%.1f, 圓心(%.1f, %.1f)的圓心上", x1, y1, radious, x2, y2));
            }
            else if (dist < radious){
                throw new InException(String.format("(%.1f, %.1f)在半徑%.1f, 圓心(%.1f, %.1f)的圓心上", x1, y1, radious, x2, y2));
            }
            else{
                throw new CenterException(String.format("(%.1f, %.1f)在半徑%.1f, 圓心(%.1f, %.1f)的圓心上", x1, y1, radious, x2, y2));
            }
        } catch (OutException e){
            System.out.println(e.getMessage());
        } catch (InException e){
            System.out.println(e.getMessage());
        } catch (CenterException e){
            System.out.println(e.getMessage());
        }
    }
}
