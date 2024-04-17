package dalilagiu9.U5W3D3.compositeEntities;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable{
    private List<Printable> contents = new ArrayList<>();
    private List<String> authors = new ArrayList<>();
    private double price;

    public void add(Printable printable){
        contents.add(printable);
    }

    public void addAuthor(String author){
        authors.add(author);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        for(Printable printable : contents) {
            printable.print();
        }
    }

    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (Printable printable : contents) {
            total += printable.getNumberOfPages();
        }
        return total;
    }
}
