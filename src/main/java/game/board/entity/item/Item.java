package game.board.entity.item;

import game.board.utils.Component;

public abstract class Item extends Component {

    public String name;

    public Item(String name) {
        this.name = name;
    }

}
