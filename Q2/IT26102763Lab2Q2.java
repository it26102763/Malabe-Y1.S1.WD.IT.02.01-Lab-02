public class IT26102763Lab2Q2 {
    public static void main(String[] args) {

        double side = 10.0;
        double squarePerimeter = 4 * side;

        double circumference = squarePerimeter;
        double pi = 3.14; 

        double radius = circumference / (2 * pi);
        
        System.out.println("Radius of the circular fence: " + radius);
    }
}