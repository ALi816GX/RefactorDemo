package gildedRose;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item each : items) {

            switch (each.name) {
                case ItemNameType.AGED_BRIE:
                    handleAgedBrieItem(each);
                    break;
                case ItemNameType.BACKSTAGE_PASSES:
                    handleBackstagePassesItem(each);
                    break;
                case ItemNameType.SULFURAS:
                    handleSulfurasItem(each);
                    break;
                default:
                    handleNormalItem(each);
                    break;
            }

        }

    }

    private void handleSulfurasItem(Item each) {

        increaseQualityWithin50(each);

        if (isSellInLess0(each) && isQulityOver0(each) && !isSulfuras(each)) {
            decreaseQuality(each);
        }

    }

    private void handleBackstagePassesItem(Item each) {
        if (isQulityWithin50(each)) {

            increaseQualityWithin50(each);

            if (each.sellIn < 11) {
                increaseQualityWithin50(each);
            }

            if (each.sellIn < 6) {
                increaseQualityWithin50(each);
            }

        }

        decreaseSellIn(each);

        if (isSellInLess0(each)) {
            clearQualityto0(each);
        }

    }

    private void handleAgedBrieItem(Item each) {

        increaseQualityWithin50(each);

        decreaseSellIn(each);

        if (isSellInLess0(each)) {
            if (!isAged_brie(each) && isQulityOver0(each)) {
                decreaseQuality(each);
            } else {
                increaseQualityWithin50(each);
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

    private void clearQualityto0(Item each) {
        each.quality = 0;
    }

    private void decreaseSellIn(Item each) {
        each.sellIn--;
    }

    private void increaseQualityWithin50(Item item) {
        if (isQulityWithin50(item)) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item) {
        item.quality--;
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