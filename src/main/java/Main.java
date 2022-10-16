public class Main {
    public static void main(String[] args) {
        try{
            if(args[0].charAt(0) == 's'){
                System.out.println("The Field: " + Shapes.Square.Calculate_field(Double.parseDouble(args[1])));
                System.out.println("The Perimeter: " + Shapes.Square.Calculate_perimeter(Double.parseDouble(args[1])));
            }
            else if(args[0].charAt(0) == 'c'){
                System.out.println("The Field: " + Shapes.Circle.Calculate_field(Double.parseDouble(args[1])));
                System.out.println("The Perimeter: " + Shapes.Circle.Calculate_perimeter(Double.parseDouble(args[1])));
            }
            else{
                throw new Exception();
            }
        }
        catch (Exception ex){
            System.out.println("Incorrect data");
        }
    }
}
