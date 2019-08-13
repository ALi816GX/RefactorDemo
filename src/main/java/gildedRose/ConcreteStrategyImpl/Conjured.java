package gildedRose.ConcreteStrategyImpl;

import gildedRose.Item;
import gildedRose.UpdateItemStrategy;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/13
 * @Time:22:20
 * @description:
 */
public class Conjured implements UpdateItemStrategy {
    @Override
    public void handle(Item item) {
        if (item.isQulityOver0()) {
            item.decreaseQuality();
            item.decreaseQuality();
        }

        item.decreaseSellIn();

        if (item.isSellInLess0() && item.isQulityWithin50()) {
            item.decreaseQuality();
            item.decreaseQuality();
        }
    }
}
