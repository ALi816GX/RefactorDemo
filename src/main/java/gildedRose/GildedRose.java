package gildedRose;

import gildedRose.ConcreteStrategyImpl.AgedBrie;
import gildedRose.ConcreteStrategyImpl.BackstagePasses;
import gildedRose.ConcreteStrategyImpl.Normal;
import gildedRose.ConcreteStrategyImpl.Sulfuras;

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
                default:
                    updateItemStrategy = new Normal();
                    break;
            }

            updateItemStrategy.handle(each);

        }

    }


}