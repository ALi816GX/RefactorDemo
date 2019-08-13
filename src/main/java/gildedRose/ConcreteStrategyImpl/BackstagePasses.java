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
public class BackstagePasses implements UpdateItemStrategy {
    @Override
    public void handle(Item item) {
        if (item.isQulityWithin50()) {

            item.increaseQualityWithin50();

            if (item.sellIn < 11) {
                item.increaseQualityWithin50();
            }

            if (item.sellIn < 6) {
                item.increaseQualityWithin50();
            }

        }

        item.decreaseSellIn();

        if (item.isSellInLess0()) {
            item.clearQualityto0();
        }
    }
}
