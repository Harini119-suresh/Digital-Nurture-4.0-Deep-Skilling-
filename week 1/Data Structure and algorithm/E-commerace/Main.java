public class Main {
    public static void main(String[] args) {
        SearchFactory factory = new SearchFactory();

        SearchStrategy search1 = factory.getSearchStrategy("NAME");
        search1.search("Laptop");

        SearchStrategy search2 = factory.getSearchStrategy("CATEGORY");
        search2.search("Electronics");

        SearchStrategy search3 = factory.getSearchStrategy("PRICE");
        search3.search("500-1000");
    }
}
