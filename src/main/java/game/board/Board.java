package game.board;

import game.utils.Component;

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
