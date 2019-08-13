package gildedRose.ConcreteStrategyImpl;

import gildedRose.Item;
import gildedRose.UpdateItemStrategy;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/13
 * @Time:21:04
 * @description:
 */
public class Normal implements UpdateItemStrategy {
    @Override
    public void handle(Item item) {
        if (item.isQulityOver0()) {
            item.decreaseQuality();
        }

        item.decreaseSellIn();

        if (item.isSellInLess0() && item.isQulityWithin50()) {
            item.decreaseQuality();
        }
    }
}
