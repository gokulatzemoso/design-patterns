package gildedrose.rules;

import gildedrose.Item;

public class Rule2 implements AbstractRule{
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            AbstractRule.increaseItemQualityBy(item, 1);
            if (item.sellIn < 11 && item.quality < 50) {
                AbstractRule.increaseItemQualityBy(item, 1);
            }
            if (item.sellIn < 6 && item.quality < 50) {
                AbstractRule.increaseItemQualityBy(item, 1);
            }
        }
        AbstractRule.decreaseSellinBy(item, 1);
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
