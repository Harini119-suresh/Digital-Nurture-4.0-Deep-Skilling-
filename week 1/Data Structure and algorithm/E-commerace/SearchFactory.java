public class SearchFactory {
    public SearchStrategy getSearchStrategy(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("NAME")) {
            return new NameSearch();
        } else if (type.equalsIgnoreCase("CATEGORY")) {
            return new CategorySearch();
        } else if (type.equalsIgnoreCase("PRICE")) {
            return new PriceRangeSearch();
        }
        return null;
    }
}
