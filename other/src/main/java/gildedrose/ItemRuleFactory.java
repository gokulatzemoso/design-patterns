package gildedrose;

import gildedrose.rules.*;

public class ItemRuleFactory {
    public static AbstractRule getItemRules(Item.ItemName itemName) {
        return switch (itemName) {
            case A -> new Rule1();
            case B -> new Rule2();
            case C -> new DefaultRule();
            case D -> new DefaultRule();
            case E -> new NoOpRule();
            case F -> new Rule3();
            default -> new DefaultRule();
        };
    }
}
