import java.util.Comparator;
public class CommentsComparable implements Comparator<Book> {
    boolean acs;
    public CommentsComparable(boolean acs) {
        this.acs = acs;
    }
    @Override
    public int compare(Book o1, Book o2) {
        if(acs)
        {
            return o1.comments-o2.comments;
        }
        else{
            return o2.comments-o1.comments;
        }
    }
}
