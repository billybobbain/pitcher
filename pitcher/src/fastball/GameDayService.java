package fastball;

import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.annotate.Path;
import org.codegist.crest.annotate.PathParam;

import fastball.view.Inning;
import fastball.view.Player;
import fastball.view.miniscoreboard.Game;
import fastball.view.scoreboard.ScoreBoard;
//http://gd2.mlb.com/components/game/mlb/year_2011/month_10/day_24/gid_2011_10_24_slnmlb_texmlb_1/players.xml
@EndPoint("http://gd2.mlb.com")
@Path("components/game/mlb")
public interface GameDayService {
	
//	@Path("mlb/year_2011/month_10/day_24/gid_2011_10_24_slnmlb_texmlb_1/players.xml")
//	Game getGame();
	
	@Path("year_{year}/month_{month}/day_{day}/{game_id}/inning/inning_{inning}.xml")
	Inning getInning(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day")String day,@PathParam("game_id") String gameId, @PathParam("inning")int inning);	
	
	// requires 4 digit year, 2 digit day and month
	@Path("year_{year}/month_{month}/day_{day}/scoreboard.xml")
	ScoreBoard getScoreBoard(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day")String day);
	
	@Path("year_{year}/month_{month}/day_{day}/{game_id}/miniscoreboard.xml")
	Game getMiniScoreboardGame(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day")String day,@PathParam("game_id") String gameId);
	
	@Path("year_{year}/month_{month}/day_{day}/{game_id}/pitchers/{id}.xml")
	Player getPitcher(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day")String day,@PathParam("game_id") String gameId,@PathParam("player_id") String playerId);

	@Path("year_{year}/month_{month}/day_{day}/{game_id}/players.xml")
	fastball.view.Game getGamePlayers(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day")String day,@PathParam("game_id") String gameId);
}
