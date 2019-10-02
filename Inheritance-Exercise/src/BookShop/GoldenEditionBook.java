package BookShop;

public class GoldenEditionBook extends Book {
    private static  final double PRICE_UP = 1.30;

    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price * PRICE_UP);
    }
}
