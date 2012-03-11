package com.billybobbain.pitcher;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;

import com.billybobbain.pitcher.provider.DataContentProvider;
import com.googlecode.chartdroid.core.IntentConstants;

import fastball.GameDayBean;
import fastball.view.scoreboard.GoGame;
import fastball.view.scoreboard.ScoreBoard;
import fastball.view.scoreboard.SgGame;

public class PitcherActivity extends Activity implements View.OnClickListener {
	
    private String dayPath = "http://gd2.mlb.com/components/game/mlb/year_2011/month_10/day_24/scoreboard.xml";
    private String gamePath = "year_2011/month_10/day_24/gid_2011_10_24_slnmlb_texmlb_1/";
    static final String TAG = Market.TAG;

    final int DIALOG_CHARTDROID_DOWNLOAD = 1;
    
    ScoreBoard scoreBoard;
    /** Called when the activity is first created. */
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // doGameQuery();
        setContentView(R.layout.main);
        findViewById(R.id.button_sample_datasets).setOnClickListener(this);
        findViewById(R.id.scoreboardButton).setOnClickListener(this);
       
        CalendarView calendar = (CalendarView)findViewById(R.id.calendarView1);
        Calendar x = new GregorianCalendar();
        x.set(2011, 9, 24);
        calendar.setDate(x.getTimeInMillis());
        
    }
    
    final Handler mHandler = new Handler();
    
    private void doScoreBoardQuery() {
		Thread t = new Thread() {
			public void run() {	
				Looper.prepare();
		        try {
		        	
		        	scoreBoard = new GameDayBean().getScoreBoard(2012, 3, 9);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        mHandler.post(mUpdateResults);
				 Looper.loop();
			}
		};
		t.start();
	}
    
 // Create runnable for posting
 	final Runnable mUpdateResults = new Runnable() {
 		public void run() {
 			updateResultsInUi();
 		}
 	};
 	
 	private void updateResultsInUi() {
 		EditText text = (EditText)findViewById(R.id.debug_text);
 		if(scoreBoard != null) {
 			StringBuilder b = new StringBuilder();
 			List<GoGame> goGame = scoreBoard.getGoGame();
 			List<SgGame> sgGame = scoreBoard.getSgGame();
 			if(goGame != null) {
 				for(GoGame gg : goGame) {
 					b.append(gg.getGame().getId()).append("\n");
 				} 				
 			}
 			if(sgGame != null) {
 				for(SgGame sg : sgGame) {
 					b.append(sg.getGame().getId()).append("\n");
 				}
 			}
 			text.setText(b.toString());
 		}
 		
	}
 	
	@Override
	protected void onPrepareDialog(int id, final Dialog dialog) {
		super.onPrepareDialog(id, dialog);
		
		Log.d(TAG, "Called onPrepareDialog()");
	
		switch (id) {
		case DIALOG_CHARTDROID_DOWNLOAD:
		{
			boolean has_android_market = Market.isIntentAvailable(this,
					Market.getMarketDownloadIntent(Market.CHARTDROID_PACKAGE_NAME));

			Log.d(TAG, "has android market? " + has_android_market);
			
			dialog.findViewById(android.R.id.button1).setVisibility(
					has_android_market ? View.VISIBLE : View.GONE);
			break;
		}
		default:
			break;
		}
	}
    
	// ========================================================================

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_sample_datasets:
		{
			String gameId = "2011_10_24_slnmlb_texmlb_1";
			String[] gameIdParts = gameId.split("_");
			String away = gameIdParts[3].replace("mlb", "");
			String home = gameIdParts[4].replace("mlb", "");
			String datePath = "2011/10/24";
			String gamePath = datePath + "/"+gameId;
			
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.withAppendedPath(DataContentProvider.PROVIDER_URI,gamePath));
            i.putExtra(Intent.EXTRA_TITLE, away + " at " + home + " on " + datePath);
			i.putExtra(IntentConstants.Meta.Axes.EXTRA_FORMAT_STRING_Y, "%.1f");
			
			
			if (Market.isIntentAvailable(this, i)) {
				startActivity(i);
			} else {
				showDialog(DIALOG_CHARTDROID_DOWNLOAD);
			}

			break;
		}
		case R.id.scoreboardButton:
			this.doScoreBoardQuery();
			break;
		}
	}

}