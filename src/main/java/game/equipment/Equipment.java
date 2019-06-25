package game.equipment;

import game.entity.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Equipment {

    private List<Item> equipment = new ArrayList<Item>();

    public List<Item> getEquipment() {
        return equipment;
    }

    public void addItem (Item item) {
        equipment.add(item);
    }
}
