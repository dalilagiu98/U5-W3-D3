package dalilagiu9.U5W3D3.compositeEntities;

public class Page implements Printable{
    private int pageNumber;

    public Page(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void print() {
        System.out.println("Stampa della pagina: " + pageNumber );
    }

    @Override
    public int getNumberOfPages() {
        return 1;
    }
}
