package dalilagiu9.U5W3D3;

import dalilagiu9.U5W3D3.compositeEntities.Book;
import dalilagiu9.U5W3D3.compositeEntities.Page;
import dalilagiu9.U5W3D3.compositeEntities.Section;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application2 {
    public static void main(String[] args){
        SpringApplication.run(Application2.class, args);

        //BOOK CREATION:
        Book book = new Book();
        book.addAuthor("John Doe");
        book.setPrice(29.99);

        //ADDING PAGE:
        Page page1 = new Page(1);
        Page page2 = new Page(2);
        Page page3 = new Page(3);
        Page page4 = new Page(4);
        Page page5 = new Page(5);
        Page page6 = new Page(6);
        book.add(page1);
        book.add(page2);
        book.add(page3);
        book.add(page4);

        //CREATION SECTIONS:
        Section section1 = new Section();
        Section section2 = new Section();
        section1.add(page5);
        section2.add(page6);

        //ADDING SECTIONS IN BOOK:
        book.add(section1);
        book.add(section2);

        //TOTAL NUMBER OF PAGE:
        int totalPages = book.getNumberOfPages();
        System.out.println("Total number of pages: " + totalPages);
    }
}
