package gildedRose;

import gildedRose.ConcreteStrategyImpl.*;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        UpdateItemStrategy updateItemStrategy;

        for (Item each : items) {

            switch (each.name) {
                case ItemNameType.AGED_BRIE:
                    updateItemStrategy = new AgedBrie();
                    break;
                case ItemNameType.BACKSTAGE_PASSES:
                    updateItemStrategy = new BackstagePasses();
                    break;
                case ItemNameType.SULFURAS:
                    updateItemStrategy = new Sulfuras();
                    break;
                case ItemNameType.CONJURED:
                    updateItemStrategy = new Conjured();
                    break;
                default:
                    updateItemStrategy = new Normal();
                    break;
            }

            updateItemStrategy.handle(each);

        }

    }


}