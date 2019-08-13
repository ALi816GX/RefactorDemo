package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public boolean isSellInLess0() {
        return this.sellIn < 0;
    }

    public boolean isQulityWithin50() {
        return this.quality < 50;
    }

    public boolean isQulityOver0() {
        return this.quality > 0;
    }

    public void clearQualityto0() {
        this.quality = 0;
    }

    public void decreaseSellIn() {
        this.sellIn--;
    }

    public void increaseQualityWithin50() {
        if (isQulityWithin50()) {
            this.quality++;
        }
    }

    public void decreaseQuality() {
        this.quality--;
    }


}
