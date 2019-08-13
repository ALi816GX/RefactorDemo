package gildedRose;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/8/12
 * @Time:20:33
 * @description:
 */
public class GildedRoseTest {


    //-----normal-----//

    @Test
    public void should_return_item_given_a_normal_item_its_sellIn_is_5_quality_is_10() {

        Item item = new Item("normal", 5, 10);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("normal, 4, 9", result.toString());

    }


    @Test
    public void should_return_item_given_a_normal_item_its_sellIn_is_0_quality_is_10(){

        Item item = new Item("normal", 0, 10);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("normal, -1, 8", result.toString());

    }









}