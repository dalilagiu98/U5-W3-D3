package dalilagiu9.U5W3D3.compositeEntities;

import java.util.ArrayList;
import java.util.List;

public class Section implements Printable{
    private List<Printable> children = new ArrayList<>();

    public void add(Printable printable){
        children.add(printable);
    }

    @Override
    public void print() {
        for(Printable printable : children) {
            printable.print();
        }
    }

    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (Printable printable : children) {
            total+= printable.getNumberOfPages();
        }
        return total;
    }
}
