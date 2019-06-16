package game.board;

import game.item.Item;
import game.player.Player;

public class Board extends Component{

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

    public void addComponent (int widthCoordinateField, int lengthwidthCoordinateField, Component component) {
        components[widthCoordinateField][lengthwidthCoordinateField] = component;
    }

    public static boolean isAvailableField(Component[][] board, Player player) {

        if (board[player.getMoveX()][player.getMoveY()] == null) {
            return true;
        } else if (board[player.getMoveX()][player.getMoveY()].equals(Item.class)) {
            player.addItem((Item) board[player.getMoveX()][player.getMoveY()]);
            return true;
        }  else {
            return false;
        }
    }

}
