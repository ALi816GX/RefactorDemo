package gildedRose;
public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isAged_brie(items[i]) && !isBackstage_Passes(items[i])) {
                if (items[i].quality > 0) {
                    if (!isSulfuras(items[i])) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (isBackstage_Passes(items[i])) {
                        if (items[i].sellIn < 11) {
                            increaseQuality(items[i]);
                        }

                        if (items[i].sellIn < 6) {
                            increaseQuality(items[i]);
                        }
                    }
                }
            }

            if (!isSulfuras(items[i])) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isAged_brie(items[i])) {
                    if (!isBackstage_Passes(items[i])) {
                        if (items[i].quality > 0) {
                            if (!isSulfuras(items[i])) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    }
                    else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    increaseQuality(items[i]);
                }
            }
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
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