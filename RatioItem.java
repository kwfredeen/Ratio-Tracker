/**
 * Represents an item to include in the ratio
 */
public class RatioItem {
    /*
    AF:
    AF(String s, double w, double q) -> s, w, q
    RI: N/A
    SRE:
    all fields private
    fields are either immutable or never returned directly
     */

    private String name; //name of the item, i.e. a
    private double weight; //weight in the overall ratio, i.e. 2 in 2a:1b
    private double quantity; //quantity of the item

    /**
     * Create an item with the given name, weight, and starting quantity
     * @param name name of the item
     * @param weight weight of the item in the ratio
     * @param quantity quantity of the item
     */
    public RatioItem(String name, double weight, double quantity){
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    /**
     * creates a copy of this ratio item, to prevent mutation of this item
     * @return a copy of this item
     */
    public RatioItem copy(){
        return new RatioItem(this.name, this.weight, this.quantity);
    }

    /**
     * Add items to this item's quantity
     * @param quantity quantity to add
     */
    public void addQuantity(double quantity){
        this.quantity += quantity;
    }

    /**
     * sets this item's quantity
     * @param quantity new quantity
     */
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    /**
     * Gets this item's quantity
     * @return this item's quantity
     */
    public double getQuantity() {
        return this.quantity;
    }

    /**
     * sets this item's ratio weight
     * @param weight this item's new weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * Gets this item's ratio weight
     * @return this item's ratio
     */
    public double getWeight(){
        return this.weight;
    }

    /**
     * Gets this item's name
     * @return name of this item
     */
    public String getName(){
        return this.name;
    }
}
