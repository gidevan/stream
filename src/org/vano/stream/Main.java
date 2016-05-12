package org.vano.stream;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Ivan_Pukhov on 5/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Stream: start");
        List<Item> items = Utils.createItems(1000);
        List<Item> filtered = items.stream().filter(t -> t.getDigit() >= 100 && t.getDigit() < 105).collect(toList());
        System.out.println("Main Stream: filtered.size: " + filtered.size());
    }
}
