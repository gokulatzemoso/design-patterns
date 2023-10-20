package gildedrose.rules;

import gildedrose.Item;

public class Rule3 implements AbstractRule{
    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            AbstractRule.decreaseItemQualityBy(item, 2);
        }
        AbstractRule.decreaseSellinBy(item, 1);
        if (item.sellIn < 0 && item.quality > 0) {
            AbstractRule.decreaseItemQualityBy(item, 2);
        }
    }
}
