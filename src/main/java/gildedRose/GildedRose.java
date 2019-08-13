package gildedRose;
public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item each:items) {
            
            if (!isAged_brie(each) && !isBackstage_Passes(each)) {
                if (each.quality > 0) {
                    if (!isSulfuras(each)) {
                        decreaseQuality(each);
                    }
                }
            } else {
                if (each.quality < 50) {
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

            if (!isSulfuras(each)) {
                each.sellIn = each.sellIn - 1;
            }

            if (each.sellIn < 0) {
                if (!isAged_brie(each)) {
                    if (!isBackstage_Passes(each)) {
                        if (each.quality > 0) {
                            if (!isSulfuras(each)) {
                                decreaseQuality(each);
                            }
                        }
                    }
                    else {
                        each.quality = each.quality - each.quality;
                    }
                } else {
                    increaseQuality(each);
                }
            }
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
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