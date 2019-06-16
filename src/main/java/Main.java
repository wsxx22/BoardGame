import board.Board;
import board.Component;
import item.Item;
import item.Shield;
import item.Sword;
import obstacle.Obstacle;
import obstacle.Tree;
import player.Player;
import utils.Type;

public class Main {

    public static void main(String[] args) {

        Item axe = new Sword("Axe", Type.OFFENSIVE, 10);
        Item lightShield = new Shield("Light Shield", Type.DEFENSIVE, 5);

        Obstacle tree = new Tree("tree");

        Player janek = new Player("janek22", Type.OFFENSIVE);
        Board boardJungle = new Board("jungle", 10, 10);

        Component[][] board = new Component[boardJungle.getBoardLength()][boardJungle.getBoardWidth()];
        janek.setBoard(board);

        board[2][3] = axe;
        board[4][7] = lightShield;
        board[2][7] = tree;

        janek.moveUp(isAvailableFieldOnBoard(board, janek));

    }

    private static boolean isAvailableFieldOnBoard (Component[][] board, Player player) {

        if (board[player.getMoveBoardWidth()][player.getMoveBoardLength()] == null) {
            return true;
        } else if (board[player.getMoveBoardWidth()][player.getMoveBoardLength()].equals(Item.class)) {
            player.addItem((Item) board[player.getMoveBoardWidth()][player.getMoveBoardLength()]);
            return true;
        }  else {
            return false;
        }

    }

}
