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
            increaseQualityWithin50(each);
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

}