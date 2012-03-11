/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fastball.view.scoreboard;



import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "ig_game")
@Default(DefaultType.FIELD)
public class IgGame {
    
    @Element(name="game")
    private Game game;
    

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
   
    
}
