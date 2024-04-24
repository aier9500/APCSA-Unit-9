class ItemForSale {

    private double price; 
    private boolean discount; 

}

class Movie extends ItemForSale{

    private String name; 
    private String year; 
    private double lengthInMin;
}

class Book extends ItemForSale {

    private String name; 
    private String year; 
    private int pages; 
    private boolean hardCover; 
}

class Author extends Book {

    private String name; 
    private String country; 
}

public class Store
{
    // instance variable (could be an array or ArrayList of one of the classes
    // above)

    public static void main(String[] args)
    {
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);
    }
}

