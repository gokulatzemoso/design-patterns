package gildedrose.rules;


import gildedrose.Item;

public class Rule1 implements AbstractRule{

    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
