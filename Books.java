import java.net.SocketPermission;

public class Books {
    String title;
    String author;
    int price;
    public Books(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // Getter and setter methods
    // Getter for title
    public String getTitle(){
        return title;
    }
    // Setter for title
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getPrice()
    {
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Books b1=new Books("Harry Potter","J.K. Rowling",500);
        b1.displayInfo();
        // For updation
        b1.setTitle("Harrrrrrr");
        b1.setAuthor("J.K. Rowlingggggggg");
        b1.setPrice(1000);
        b1.displayInfo();   
        System.out.println("Updated Information:");
    }
    // What is the use of override
    
}
