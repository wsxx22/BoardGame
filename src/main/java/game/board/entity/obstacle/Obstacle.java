package game.board.entity.obstacle;

import game.board.utils.Component;

public abstract class Obstacle extends Component {

    private String name;

    private final String description = "You can't enter this field";

    public Obstacle(String name) {
        this.name = name;
    }
}
