package gildedRose;
public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for(Item each:items) {
            
            if (!isAged_brie(each) && !isBackstage_Passes(each)) {
                if (isQulityOver0(each)) {
                    if (!isSulfuras(each)) {
                        decreaseQuality(each);
                    }
                }
            } else {
                if (isQulityWithin50(each)) {
                    increaseQuality(each);

                    if (isBackstage_Passes(each)) {
                        if (each.sellIn < 11) {
                            increaseQuality(each);
                        }

                        if (each.sellIn < 6) {
                            increaseQuality(each);
                        }
                    }
                }
            }

            decreaseSellIn(each);

            if (each.sellIn < 0) {
                if (!isAged_brie(each)) {
                    if (!isBackstage_Passes(each)) {
                        if (isQulityOver0(each)) {
                            if (!isSulfuras(each)) {
                                decreaseQuality(each);
                            }
                        }
                    }
                    else {
                        clear0Quality(each);
                    }
                } else {
                    increaseQuality(each);
                }
            }
        }
    }

    private boolean isQulityWithin50(Item each) {
        return each.quality < 50;
    }

    private boolean isQulityOver0(Item each) {
        return each.quality > 0;
    }

    private void clear0Quality(Item each) {
        each.quality = 0;
    }

    private void decreaseSellIn(Item each) {
        if (!isSulfuras(each)) {
            each.sellIn--;
        }
    }

    private void increaseQuality(Item item) {
        if (isQulityWithin50(item)) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item) {
            item.quality = item.quality - 1;
    }


    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstage_Passes(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAged_brie(Item item) {
        return item.name.equals("Aged Brie");
    }
}