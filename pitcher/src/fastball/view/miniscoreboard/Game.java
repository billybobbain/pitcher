package fastball.view.miniscoreboard;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false,name="game")
@Default(DefaultType.FIELD)
public class Game {
	
	@Element(name="linescore",required=false)
	private LineScore lineScore;

	public LineScore getLineScore() {
		return lineScore;
	}

	public void setLineScore(LineScore lineScore) {
		this.lineScore = lineScore;
	}

}
