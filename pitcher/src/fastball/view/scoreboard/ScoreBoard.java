/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fastball.view.scoreboard;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "scoreboard")

public class ScoreBoard {
    
    @Attribute(name="date")
    private String date;
    
    @Attribute(name="last_modified")
    private String lastModified;
    
    @ElementList(required=false,inline=true,entry="go_game")
    private List<GoGame> goGame;

    @ElementList(required=false,inline=true,entry="sg_game")
    private List<SgGame> sgGame;

    @ElementList(required=false,inline=true,entry="ig_game")
    private List<IgGame> igGame;

    public List<SgGame> getSgGame() {
        return sgGame;
    }

    public void setSgGame(List<SgGame> sgGame) {
        this.sgGame = sgGame;
    }

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<GoGame> getGoGame() {
        return goGame;
    }

    public void setGoGame(List<GoGame> goGame) {
        this.goGame = goGame;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

	public List<IgGame> getIgGame() {
		return igGame;
	}

	public void setIgGame(List<IgGame> igGame) {
		this.igGame = igGame;
	}
    
    
         
    
}
