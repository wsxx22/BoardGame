package game.item;

import game.board.Component;
import game.utils.Type;

public abstract class Item extends Component {

    public Item(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String name;

    private Type type;

}
