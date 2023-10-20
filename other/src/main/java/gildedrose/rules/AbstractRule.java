package gildedrose.rules;


import gildedrose.Item;

public interface AbstractRule {

    default void updateItem(Item item) {
        if (item.quality > 0) {
            AbstractRule.decreaseItemQualityBy(item, 1);
        }
        AbstractRule.decreaseSellinBy(item, 1);
        if (item.sellIn < 0 && item.quality > 0) {
            AbstractRule.decreaseItemQualityBy(item, 1);
        }
    }

    static void decreaseItemQualityBy(Item item, int decreaseBy) {
        item.quality = item.quality - decreaseBy;
    }

    static void increaseItemQualityBy(Item item, int increaseBy) {
        item.quality = item.quality + increaseBy;
    }

    static void decreaseSellinBy(Item item, int decreaseBy) {
        item.sellIn = item.sellIn - decreaseBy;
    }
}
