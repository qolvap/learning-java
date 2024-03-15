public class Smartphone {
    private String brandName;
    private boolean isNew; // if true = new, false = old
    private double price;

    // Constructor method:
 Smartphone(String newBrandName, boolean newIsNew) {
        brandName = newBrandName;
        isNew = true;
        price = newPrice;
    }
  // 1. name of constructor must be as name of class
  // 2. cant have public, private, protected, static modificators
  // 3. constructor implements automatic by java when objcet is created of the class

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String newBrandName) {
        this.brandName = newBrandName;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newIsNew) {
        this.isNew = newIsNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            this.price = 0;
        } else {
            this.price = newPrice;
        }
    }
}
