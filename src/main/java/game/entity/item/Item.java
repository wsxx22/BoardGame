package game.entity.item;

import game.utils.Component;

public abstract class Item extends Component {

    public String name;

    public Item(String name) {
        this.name = name;
    }

}
