package gildedrose.rules;

import gildedrose.Item;

public class Rule3 implements AbstractRule{
    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn = item.sellIn - 2;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
