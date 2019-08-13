package gildedRose;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (Item each : items) {

            //-----normal-----//

            if (isNormal(each)) {

                handleNormalItem(each);

            }

            //-----Aged Brie-----//

            else if (isAged_brie(each)) {

                handleAgedBrieItem(each);

            }

            //-----Backstage Passes-----//
            else if (isBackstage_Passes(each)) {

                if (isQulityWithin50(each)) {
                    increaseQuality(each);

                    if (each.sellIn < 11) {
                        increaseQuality(each);
                    }

                    if (each.sellIn < 6) {
                        increaseQuality(each);
                    }

                }

                decreaseSellIn(each);

                if (isSellInLess0(each)) {
                    clear0Quality(each);
                }

            }


            //-----Sulfuras-----//
            else if (isSulfuras(each)) {

                if (isQulityWithin50(each)) {
                    increaseQuality(each);
                }

                if (isSellInLess0(each) && isQulityOver0(each) && !isSulfuras(each)) {
                    decreaseQuality(each);
                }

            }


        }

    }

    private void handleAgedBrieItem(Item each) {
        if (isQulityWithin50(each)) {
            increaseQuality(each);
        }

        decreaseSellIn(each);

        if (isSellInLess0(each)) {
            if (!isAged_brie(each) && isQulityOver0(each)) {
                decreaseQuality(each);
            } else {
                increaseQuality(each);
            }
        }
    }

    private void handleNormalItem(Item each) {
        if (isQulityOver0(each)) {
            decreaseQuality(each);
        }

        decreaseSellIn(each);

        if (isSellInLess0(each) && isQulityWithin50(each)) {
            decreaseQuality(each);
        }
    }

    private boolean isNormal(Item each) {
        return !isAged_brie(each) && !isBackstage_Passes(each) && !isSulfuras(each);
    }

    private boolean isSellInLess0(Item each) {
        return each.sellIn < 0;
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