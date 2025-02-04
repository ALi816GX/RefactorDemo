package gildedRose.ConcreteStrategyImpl;

import gildedRose.Item;
import gildedRose.UpdateItemStrategy;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/13
 * @Time:21:05
 * @description:
 */
public class AgedBrie implements UpdateItemStrategy {
    @Override
    public void handle(Item item) {
        item.increaseQualityWithin50();

        item.decreaseSellIn();

        if (item.isSellInLess0()) {
            item.increaseQualityWithin50();
        }
    }
}
