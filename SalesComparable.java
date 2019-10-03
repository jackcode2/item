import java.util.Comparator;
public class SalesComparable implements Comparator<Book>{
    boolean asc;
    public SalesComparable(boolean asc) {
        this.asc = asc;
    }
    @Override
    public int compare(Book o1, Book o2) {
     if(asc)
     {
         return o1.sales-o2.sales;
     }else{
         return o2.sales-o1.sales;
     }
    }
}
