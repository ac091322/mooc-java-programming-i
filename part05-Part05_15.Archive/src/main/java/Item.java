/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
import java.util.Objects;

public class Item {

    private final String identifier;
    private final String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object added) {
        if (this == added) {
            return true;
        }

        if (!(added instanceof Item)) {
            return false;
        }

        Item addedItem = (Item) added;
        return this.identifier.equals(addedItem.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.identifier, this.name);
    }
}
