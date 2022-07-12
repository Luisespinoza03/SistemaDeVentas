package Sistema;

public class Products {

    int code;
    String name;
    String description;
    int quantity;
    int price;
    int subtotal;

    public Products() {}

    public Products(int code, String name, String description, int quantity, int price, int subtotal) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.subtotal = subtotal;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getSubtotal() {
        return subtotal;
    }
}
