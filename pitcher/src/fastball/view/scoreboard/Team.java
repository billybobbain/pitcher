/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fastball.view.scoreboard;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "team")
@Default(DefaultType.FIELD)
public class Team {
	
	private String name;
	private String code;
	
    
}
