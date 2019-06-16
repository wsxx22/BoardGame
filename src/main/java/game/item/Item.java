package game.item;

import game.board.Component;

public abstract class Item extends Component {

    public String name;

    public Item(String name) {
        this.name = name;
    }

}
