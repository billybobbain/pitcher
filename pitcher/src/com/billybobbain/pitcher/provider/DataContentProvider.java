package com.billybobbain.pitcher.provider;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.provider.BaseColumns;
import android.widget.Toast;

import com.billybobbain.pitcher.TemperatureData;
import com.googlecode.chartdroid.core.ColumnSchema;

import fastball.GameDayBean;
import fastball.view.AtBat;
import fastball.view.Inning;
import fastball.view.Pitch;
import fastball.view.miniscoreboard.Game;
import fastball.view.miniscoreboard.LineScore;

public class DataContentProvider extends ContentProvider {
	
	// This must be the same as what as specified as the Content Provider authority
		// in the manifest file.
		static final String AUTHORITY = "com.billybobbain.pitcher.provider";
		public static final Uri PROVIDER_URI = new Uri.Builder()
		.scheme(ContentResolver.SCHEME_CONTENT)
		.authority(AUTHORITY).build();
		

		@Override
		public String getType(Uri uri) {
			return ColumnSchema.PlotData.CONTENT_TYPE_PLOT_DATA;
		}

		@Override
		public boolean onCreate() {
			return true;
		}

		@Override
		public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
			// 2012/3/9/gid_2012_03_09_kcamlb_cinmlb_1
			GameDayBean gdb = new GameDayBean();
			String gamePath = uri.getPath();
			String[] split = gamePath.split("/"); // ignore leading slash
			int year = Integer.parseInt(split[1]);
			int month = Integer.parseInt(split[2]);
			int day = Integer.parseInt(split[3]);
			String gameId = split[4];
			String[] gameIdParts = gameId.split("_");
			String away = gameIdParts[4].replace("mlb", "").toUpperCase();
			String home = gameIdParts[5].replace("mlb", "").toUpperCase();
			String[] labels = new String[]{away,home};
			
			if (ColumnSchema.Aspect.DATASET_ASPECT_AXES.equals( uri.getQueryParameter(ColumnSchema.DATASET_ASPECT_PARAMETER) )) {

				MatrixCursor c = new MatrixCursor(new String[] {
						BaseColumns._ID,
						ColumnSchema.Aspect.Axes.COLUMN_AXIS_LABEL});

				int row_index = 0;
				for (int i=0; i<TemperatureData.DEMO_AXES_LABELS.length; i++) {

					c.newRow().add( row_index ).add( TemperatureData.DEMO_AXES_LABELS[i] );
					row_index++;
				}
//				int row_index = 0;
//				for (int i=1; i<10; i++) {
//
//					c.newRow().add( row_index ).add( away+"-"+i );
//					row_index++;
//					c.newRow().add( 2*row_index ).add( home+"-"+i );
//					row_index++;
//				}

				return c;
			} else if (ColumnSchema.Aspect.DATASET_ASPECT_SERIES.equals( uri.getQueryParameter(ColumnSchema.DATASET_ASPECT_PARAMETER) )) {

				// TODO: Define more columns for color, line style, marker shape, etc.
				MatrixCursor c = new MatrixCursor(new String[] {
						BaseColumns._ID,
						ColumnSchema.Aspect.Series.COLUMN_SERIES_LABEL});

				int row_index = 0;
//				for (int i=0; i<labels.length; i++) {
//
//					c.newRow().add( row_index ).add( labels[i] );
//					row_index++;
//				}
				
				Game game = gdb.getMiniScoreboardGame(year, month, day, gameId);
				int i=1;
				LineScore lineScore = game.getLineScore();
				if(lineScore != null && lineScore.getInning().size() > 0)
				for (fastball.view.miniscoreboard.Inning inning : lineScore.getInning()) {
					if(inning.getAway() != null && !inning.getAway().equals("X")) {
						c.newRow().add( row_index ).add( labels[0]+"-"+i );
						row_index++;
					}
					if(inning.getHome() != null && !inning.getHome().equals("X")) {
					c.newRow().add( row_index ).add( labels[1]+"-"+i );
					row_index++;
					}
					i++;
				}

				return c;

			} else {
				// Fetch the actual data
				

				MatrixCursor c = new MatrixCursor(new String[] {
						BaseColumns._ID,
						ColumnSchema.Aspect.Data.COLUMN_AXIS_INDEX,
						ColumnSchema.Aspect.Data.COLUMN_SERIES_INDEX,
						ColumnSchema.Aspect.Data.COLUMN_DATUM_VALUE,
						ColumnSchema.Aspect.Data.COLUMN_DATUM_LABEL
				});

				Game game = gdb.getMiniScoreboardGame(year, month, day, gameId);
				boolean noHome = false;
				int lastInning = 0;
				LineScore lineScore = game.getLineScore();
				if(lineScore != null && lineScore.getInning().size() > 0) {
					lastInning = lineScore.getInning().size();
					for (fastball.view.miniscoreboard.Inning inning : lineScore.getInning()) {
						if(inning.getHome() != null && inning.getHome().equals("X")) {
							noHome = true;
						}
					}
				}
				
				int row_index = 0;
				for(int i=1;i<=lastInning;i++) {
					try {
					Inning inning = gdb.getInning(year,month,day,gameId,i);
				
					for(AtBat ab : inning.getTop().getAtBat()) {
						for(Pitch p : ab.getPitch()) {
							c.newRow()
							.add( row_index )
							.add( ColumnSchema.X_AXIS_INDEX )
							.add( 2*i - 1 )   // Only create data for the first series.
							.add( p.getPx() )
							.add( null );
	
							row_index++;
						}
					}
					for(AtBat ab : inning.getTop().getAtBat()) {
						for(Pitch p : ab.getPitch()) {
							c.newRow()
							.add( row_index )
							.add( ColumnSchema.Y_AXIS_INDEX )
							.add( 2*i-1 )   // Only create data for the first series.
							.add( p.getPz() )
							.add( null );
	
							row_index++;
						}
					}
					if(i == lastInning && noHome) {
						continue;
					}
					for(AtBat ab : inning.getBottom().getAtBat()) {
						for(Pitch p : ab.getPitch()) {
							c.newRow()
							.add( row_index )
							.add( ColumnSchema.X_AXIS_INDEX )
							.add( i*2 )   // Only create data for the first series.
							.add( p.getPx() )
							.add( null );

							row_index++;
						}
					}
						
						for(AtBat ab : inning.getBottom().getAtBat()) {
							for(Pitch p : ab.getPitch()) {
								c.newRow()
								.add( row_index )
								.add( ColumnSchema.Y_AXIS_INDEX )
								.add( i*2 )   // Only create data for the first series.
								.add( p.getPz() )
								.add( null );

								row_index++;
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				

				return c;
			}
		}
		@Override
		public int update(Uri uri, ContentValues contentvalues, String s, String[] as) {
			throw new UnsupportedOperationException("Not supported by this provider");
		}


		@Override
		public Uri insert(Uri uri, ContentValues contentvalues) {
			throw new UnsupportedOperationException("Not supported by this provider");
		}

		@Override
		public int delete(Uri uri, String s, String[] as) {
			throw new UnsupportedOperationException("Not supported by this provider");
		}
}
	
