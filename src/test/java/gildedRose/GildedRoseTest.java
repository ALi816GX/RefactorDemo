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


    //-----Aged Brie-----//

    @Test
    public void should_return_item_given_an_Aged_Brie_item_its_sellIn_is_5_quality_is_10() {
        Item item = new Item("Aged Brie", 5, 10);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Aged Brie, 4, 11", result.toString());
    }



    @Test
    public void should_return_item_given_an_Aged_Brie_item_its_sellIn_is_5_quality_is_50(){
        Item item = new Item("Aged Brie", 5, 50);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Aged Brie, 4, 50", result.toString());
    }



    @Test
    public void should_return_item_given_an_Aged_Brie_item_its_sellIn_is_0_quality_is_10(){
        Item item = new Item("Aged Brie", 0, 10);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Aged Brie, -1, 12", result.toString());
    }

    @Test
    public void should_return_item_given_an_Aged_Brie_item_its_sellIn_is_0_quality_is_50(){
        Item item = new Item("Aged Brie", 0, 50);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Aged Brie, -1, 50", result.toString());
    }



    //----- Backstage passes -----//


    @Test
    public void should_return_item_given_an_Backstage_passes_item_its_sellIn_is_15_quality_is_20(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 21", result.toString());
    }

    @Test
    public void should_return_item_given_an_Backstage_passes_item_its_sellIn_is_10_quality_is_20()  {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 22", result.toString());
    }


    @Test
    public void should_return_item_given_an_Backstage_passes_item_its_sellIn_is_5_quality_is_20()  {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 23", result.toString());
    }




    @Test
    public void should_return_item_given_an_Backstage_passes_item_its_sellIn_is_0_quality_is_20()  {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        Item[] items = {item};

        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        Item result = gildedRose.items[0];

        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", result.toString());
    }








}