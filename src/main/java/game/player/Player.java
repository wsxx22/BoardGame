package game.player;

import game.board.Component;
import game.item.Item;
import game.utils.Type;

import java.util.ArrayList;
import java.util.List;

public class Player extends Component implements ActionPlayer{

    private String username;

    private Type typePlayer;

    private int moveBoardWidth = 0;

    private int moveBoardLength = 0;

    private Component[][] board;

    private List<Item> items = new ArrayList<Item>();

    public Player(String username, Type typePlayer) {
        this.username = username;
        this.typePlayer = typePlayer;
    }

    public String getUsername() {
        return username;
    }

    public Type getTypePlayer() {
        return typePlayer;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getMoveBoardWidth() {
        return moveBoardWidth;
    }

    public void setMoveBoardWidth(int moveBoardWidth) {
        this.moveBoardWidth = moveBoardWidth;
    }

    public int getMoveBoardLength() {
        return moveBoardLength;
    }

    public void setMoveBoardLength(int moveBoardLength) {
        this.moveBoardLength = moveBoardLength;
    }

    public Component[][] getBoard() {
        return board;
    }

    public void setBoard(Component[][] board) {
        this.board = board;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void moveUp(boolean isAvailable) {
        moveBoardLength++;
    }

    public void moveDown(boolean isAvailable) {
        moveBoardLength--;
    }

    public void moveRight(boolean isAvailable) {
        moveBoardWidth++;
    }

    public void moveLeft(boolean isAvailable) {
        moveBoardWidth--;
    }

}
