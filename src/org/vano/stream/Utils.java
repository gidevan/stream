package org.vano.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan_Pukhov on 5/12/2016.
 */
public final class Utils {

    private static final String VALUE_PREFIX = "Value: ";
    private static final String DESCRIPTION_PREFIX = "Value Description: ";
    private Utils() {
    }

    public static List<Item> createItems(long size) {
        List<Item> items = new ArrayList<>();
        for(long i = 0; i < size; i++) {
            Item item = new Item();
            item.setId(String.valueOf(i));
            item.setDigit(i);
            item.setValue(VALUE_PREFIX + i);
            item.setDescription(DESCRIPTION_PREFIX + i);
            items.add(item);
        }
        return items;
    }
}
