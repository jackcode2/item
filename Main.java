
import java.util.List;
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Book>books=new ArrayList<>();
        books.add(new Book("9787201151304", "从一到无穷大", "[美] 乔治·伽莫夫", 1600, 400, 26));
        books.add(new Book("9787559633002","大地：三部曲","[美]赛珍珠",1450,382,28));
        books.add(new Book( "9787544280334","如何用手机拍一部电影","[英]编辑部",1880,408,16));
        books.add(new Book( " 9787544775052","因为性别","[美]吉莉恩·托马斯",1600,350,29));
        books.add(new Book( "9787544296274","夏天、烟火和我的尸体","[日]乙一",1900,382,16));
        List<Book>copy;
        System.out.println("按ISBN排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);
        System.out.println("按书名排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new TitleComparable());
        System.out.println(copy);
        System.out.println("按作者顺序排名");
        copy=new ArrayList<>(books);
        Sort.sort(copy);
        System.out.println(copy);
        System.out.println("按价格从小到大排列");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(true));
        System.out.println(copy);
        System.out.println("价格按从大到小排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(false));
        System.out.println("按售出量从小到大排列");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new SalesComparable(true));
        System.out.println(copy);
        System.out.println("按售出量从大到小排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new SalesComparable(false));
        System.out.println(copy);
        System.out.println("按评论量从小到大排列");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new CommentsComparable(true));
        System.out.println(copy);
        System.out.println("按评论量从大到小排序");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new CommentsComparable(false));
        System.out.println(copy);
    }
}
