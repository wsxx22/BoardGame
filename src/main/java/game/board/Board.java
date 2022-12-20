package game.board;

import game.utils.Component;
import game.utils.Test33;

public class Board extends Component {

    private String name;

    private int boardWidth;

    private int boardLength;

    private Component[][] components;

    public Board(String name, int boardWidth, int boardLength) {
        this.name = name;
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
        components = new Component[boardWidth][boardLength];
        Test33 test33 = new Test33(1, "tt");
    }

    public String getName() {
        return name;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardLength() {
        return boardLength;
    }

    public Component[][] getComponents() {
        return components;
    }

    public void addComponent (int widthCoordinateField, int lengthCoordinateField, Component component) {
        components[widthCoordinateField][lengthCoordinateField] = component;
    }

}
