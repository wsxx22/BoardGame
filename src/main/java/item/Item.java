package item;

import board.Component;
import utils.Type;

public abstract class Item extends Component {

    public Item(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String name;

    private Type type;

}
