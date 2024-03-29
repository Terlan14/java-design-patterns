import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
    private String shopName;
     List<Book>books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadBook()
    {
        for (int i=1;i<10;i++)
        {
            Book book=new Book();
            book.setBookName("Book"+i);
            book.setBookId(i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() {
        try {
            BookShop shop = new BookShop();
            for(Book b:getBooks())
            {
                shop.getBooks().add(b);
            }
            return shop;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
