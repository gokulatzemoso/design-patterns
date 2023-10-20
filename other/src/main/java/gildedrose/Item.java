package gildedrose;

import java.util.Arrays;

public class Item {

    public enum ItemName {
        A("Aged Brie"),
        B("Backstage passes to a TAFKAL80ETC concert"),
        C("+5 Dexterity Vest"),
        D("Elixir of the Mongoose"),
        E("Sulfuras, Hand of Ragnaros"),
        F("Conjured Mana Cake");

        private String name;

        ItemName(String name) {
            this.name = name;
        }

        public static ItemName getItem(String name) {
            return Arrays.stream(values()).filter(itemName -> itemName.toString().equals(name)).findFirst().orElseThrow();
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
