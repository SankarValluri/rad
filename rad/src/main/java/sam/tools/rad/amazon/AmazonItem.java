package sam.tools.rad.amazon;

/**
 * An immutable object representing the basic details for an item from
 * Amazon.com Inc.'s Product Advertising API.
 */
public class AmazonItem {
    
    private final String asin;
    private final String title;
    private final Integer priceInCents;
    private final String formattedPrice;
    private final String url;
    private String imageUrl;
    
    public AmazonItem(
            String asin,
            String title,
            Integer priceInCents,
            String formattedPrice,
            String url,
            String imageUrl) {
        this.asin = getContent(asin);
        this.title = getContent(title);
        this.priceInCents = priceInCents;
        this.formattedPrice = 
                formattedPrice == null || formattedPrice.trim().isEmpty()
                ? "---"
                : formattedPrice.trim();
        this.url = getContent(url);
        this.imageUrl = imageUrl == null ? "" : imageUrl.trim();
    }
    
    public String getAsin() {
        return asin;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getFormattedPrice() {
        return formattedPrice;
    }
    
    public Integer getPriceInCents() {
        return priceInCents;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    private String getContent(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Content required but found \"" + str + "\"");
        }
        return str.trim();
    }
}