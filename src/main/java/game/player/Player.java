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

    private void addItem(Item item) {
        items.add(item);
    }

    public void moveUp() {
        if (isPossibilityMove(moveX, moveY))
            moveY++;
    }

    public void moveDown() {
        if (isPossibilityMove(moveX, moveY))
            moveY--;
    }

    public void moveRight() {
        if (isPossibilityMove(moveX, moveY))
            moveX++;
    }

    public void moveLeft() {
        if (isPossibilityMove(moveX, moveY))
            moveX--;
    }

    private boolean isPossibilityMove(int moveX, int moveY) {
        Component[][] components = this.board.getComponents();
        if (components[moveX][moveY] == null) {
            return true;
        }
        if (components[moveX][moveY].equals(Item.class)) {
            this.addItem((Item) components[moveX][moveY]);
            return true;
        }
        return false;
    }
}