package Productv5;

import Productv5.Book;
import Productv5.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?

        Product myProduct = null;

        //Software
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        //Books
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        //Music
        if (productCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(5.50);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Record Label");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("RHCP")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Scar tissue");
            myMusic.setPrice(5.50);
            myMusic.setArtist("Red Hot Chilly peppers");
            myMusic.setLabel("Record Label");
            myProduct = myMusic;
        }

        if (productCode.equalsIgnoreCase("Samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Samsung Smart TV");
            myTV.setPrice(555.50);
            myTV.setManufacturer("Samsung");
            myTV.setScreenSize("50 inch");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("SONY")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony Smart TV");
            myTV.setPrice(555.50);
            myTV.setManufacturer("SONY");
            myTV.setScreenSize("50 inch");
            myProduct = myTV;
        }

        return myProduct;
    }

}

