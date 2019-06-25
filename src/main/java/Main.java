import game.board.entity.board.Board;
import game.board.entity.item.Item;
import game.board.entity.item.Shield;
import game.board.entity.item.Sword;
import game.board.entity.obstacle.Obstacle;
import game.board.entity.obstacle.Tree;
import game.board.entity.player.Player;

public class Main {

    public static void main(String[] args) {

        Item axe = new Sword("Axe", 10);
        Item lightShield = new Shield("Light Shield", 5);

        Obstacle tree = new Tree("tree");

        Player janek = new Player("janek22");
        Board boardJungle = new Board("jungle", 10, 10);
        janek.setBoard(boardJungle);

        boardJungle.addComponent(2,3, axe);
        boardJungle.addComponent(4,7, lightShield);
        boardJungle.addComponent(2,8, tree);

        janek.moveUp();
    }

}
