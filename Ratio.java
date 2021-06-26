import java.util.ArrayList;
import java.util.List;

/**
 * Represents a mutable ratio, with an arbitrary number of items in the ratio
 */
public class Ratio {
/*
AF:
AF(RatioItem[] L) -> sum({i.weight | all i in L})
RI: N/A
SRE:
all fields private
fields are either immutable or are not returned directly
 */

    final List<RatioItem> items;

    /**
     * create an empty Ratio
     */
    public Ratio(){
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the ratio
     * @param item item to add
     */
    public void addItem(RatioItem item){
        this.items.add(item);
    }

    /**
     * Gets the item at the specified index
     * @param index index of the item
     * @return copy of the item
     */
    public RatioItem getItem(int index){
        return this.items.get(index).copy();
    }

    /**
     * Gets the sum of the weights of all items in this
     * @return sum of all item weights
     */
    public double getTotalWeight(){
        double sum = 0;
        for(RatioItem item : this.items){
            sum += item.getWeight();
        }
        return sum;
    }

    //TODO: Get current effective ratio based on quantities
    //theory: set smallest quantity to have an effective contribution of 1. other components are based on that quantity.
    // i.e. for quantities 1.5, 3, 6, the effective ratio would be 1, 2, 4
}
