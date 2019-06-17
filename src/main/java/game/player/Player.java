package game.player;

import game.board.Board;
import game.board.Component;
import game.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Player extends Component implements ActionPlayer{

    private String username;

    private int moveX = 0;

    private int moveY = 0;

    private Board board;

    private List<Item> items = new ArrayList<Item>();

    public Player(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getMoveX() {
        return moveX;
    }

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void moveUp() {
        if (board.isAvailableField(this))
            moveY++;
    }

    public void moveDown() {
        if (board.isAvailableField(this))
            moveY--;
    }

    public void moveRight() {
        if (board.isAvailableField(this))
            moveX++;
    }

    public void moveLeft() {
        if (board.isAvailableField(this))
            moveX--;
    }

}
