package fastball;



import org.codegist.crest.CRest;
import org.codegist.crest.CRestBuilder;
import org.codegist.crest.io.http.HttpClientHttpChannelFactory;
import org.codegist.crest.serializer.simplexml.SimpleXmlDeserializer;

import fastball.view.Inning;
import fastball.view.Player;
import fastball.view.miniscoreboard.Game;
import fastball.view.scoreboard.ScoreBoard;

public class GameDayBean {

    public GameDayBean() {
        super();
//        System.setProperty("http.proxyHost", "www-proxy.us.oracle.com");
//        System.setProperty("http.proxyPort", "80");
        client = new CRestBuilder().setHttpChannelFactory(HttpClientHttpChannelFactory.class).deserializeXmlWith(SimpleXmlDeserializer.class).build();
    }
    CRest client = null;
 
//    public ScoreBoard getScoreBoard(String dayPath) {
//        WebResource wr = client.resource(dayPath);        
//        ScoreBoard scoreBoard = wr.accept(MediaType.APPLICATION_XML).get(ScoreBoard.class);
//        return scoreBoard;
//    }
//    
//    
//    public List<Inning> getInnings(String gamePath) {        
//        WebResource wr = client.resource(gamePath + "/inning");
//        int i = 1;
//        List<Inning> innings = new ArrayList<Inning>();
//        boolean done = false;
//        do {
//            try {
//                Inning inning = wr.path("inning_" + i + ".xml").accept(MediaType.APPLICATION_XML).get(Inning.class);
//                innings.add(inning);
//                i++;
//            } catch (UniformInterfaceException uie) {
//                done = true;
//            }
//
//        } while (!done);
//
//        return innings;
//    }

//    public Game getGame(String gamePath) {
//    	GameDayService service = client.build(GameDayService.class);
//        Game game = service.getGame();
//        return game;
//    }
    
    
    public Inning getInning(int year, int month, int day, String gameId,int inning) {
    	GameDayService service = client.build(GameDayService.class);
    	String yearStr = ""+year;
    	String monthStr = (month < 10) ? "0"+month : ""+month;
    	String dayStr = (day < 10) ? "0"+day : ""+day;
        Inning inningXML = service.getInning(yearStr,monthStr,dayStr,gameId,inning);        
        return inningXML;
    }
    
    public ScoreBoard getScoreBoard(int year, int month, int day) {
    	GameDayService service = client.build(GameDayService.class);
    	String yearStr = ""+year;
    	String monthStr = (month < 10) ? "0"+month : ""+month;
    	String dayStr = (day < 10) ? "0"+day : ""+day;
    	ScoreBoard scoreBoard = service.getScoreBoard(yearStr, monthStr, dayStr);
    	return scoreBoard;
    }
    
    public Game getMiniScoreboardGame(int year, int month, int day, String gameId) {
    	GameDayService service = client.build(GameDayService.class);
    	String yearStr = ""+year;
    	String monthStr = (month < 10) ? "0"+month : ""+month;
    	String dayStr = (day < 10) ? "0"+day : ""+day;
        Game game = service.getMiniScoreboardGame(yearStr,monthStr,dayStr,gameId);        
        return game;
    }
    
    public Player getPitcher(int year, int month, int day, String gameId,String playerId) {
    	GameDayService service = client.build(GameDayService.class);
    	String yearStr = ""+year;
    	String monthStr = (month < 10) ? "0"+month : ""+month;
    	String dayStr = (day < 10) ? "0"+day : ""+day;
        Player player = service.getPitcher(yearStr,monthStr,dayStr,gameId,playerId);        
        return player;
    }
    
    public fastball.view.Game getGamePlayers(int year, int month, int day, String gameId) {
    	GameDayService service = client.build(GameDayService.class);
    	String yearStr = ""+year;
    	String monthStr = (month < 10) ? "0"+month : ""+month;
    	String dayStr = (day < 10) ? "0"+day : ""+day;
    	fastball.view.Game game = service.getGamePlayers(yearStr,monthStr,dayStr,gameId);
    	return game;
    }

}
