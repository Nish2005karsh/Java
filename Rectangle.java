public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Getters and setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    // Methods to calculate area and perimeter
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        rect.setLength(6.0);
        rect.setWidth(4.0);
        System.out.println("Updated Area: " + rect.calculateArea());
        System.out.println("Updated Perimeter: " + rect.calculatePerimeter());
    }

    
}
