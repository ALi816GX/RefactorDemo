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

        each.increaseQualityWithin50();

    }

    public void handleBackstagePassesItem(Item each) {
        if (each.isQulityWithin50()) {

            each.increaseQualityWithin50();

            if (each.sellIn < 11) {
                each.increaseQualityWithin50();
            }

            if (each.sellIn < 6) {
                each.increaseQualityWithin50();
            }

        }

        each.decreaseSellIn();

        if (each.isSellInLess0()) {
            each.clearQualityto0();
        }

    }

    private void handleAgedBrieItem(Item each) {

        each.increaseQualityWithin50();

        each.decreaseSellIn();

        if (each.isSellInLess0()) {
            each.increaseQualityWithin50();
        }
    }

    private void handleNormalItem(Item each) {
        if (each.isQulityOver0()) {
            each.decreaseQuality();
        }

        each.decreaseSellIn();

        if (each.isSellInLess0() && each.isQulityWithin50()) {
            each.decreaseQuality();
        }
    }


}