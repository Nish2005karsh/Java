public class Students {
    private String name;
    private int rollNumber;
    private int marks;
    public Students(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    // Getter and Setter methods
    public String getName(){
        return name;

    }
    public void  setName(String name){
        this.name=name;
    }
    public int rollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Students sect1=new Students("Nishkarsh",20239090,900);
        sect1.displayInfo();
        // For updation
        sect1.setName("John Pork");
        sect1.setRollNumber(20239091);
        sect1.setMarks(950);
        System.out.println("Updated Information:");
        sect1.displayInfo();
    }
}
