package web.java_tomcat_maven_demo.nosql;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NavigableSet;

import org.mapdb.DB;
import org.mapdb.DBMaker;

public class MapDataCache {
	private static MapDataCache instance = null;
	private DB db = null;
	private MapDataCache() {
		this.db = DBMaker.newMemoryDB().make();
	}
	private DB getDb() {
		return this.db;
	}
	private static MapDataCache getInstance() {
		if(instance != null) 
			return instance; 
			
		synchronized(MapDataCache.class) {
			if(instance == null) {
				instance = new MapDataCache();
				return instance;
			} else 
				return instance;
		}
	}
	
	public static void putData(String map, String key, String value) {
		getInstance().getDb().getTreeMap(map).put(key,value);
		getInstance().getDb().commit();
	}
	
	public static void putDataStampKey(String map, String key, String value) {
		SimpleDateFormat localDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//Current Date Time in Local Timezone
		// System.out.println("Current Date and Time in local timezone: " + localDateFormat.format( new Date()));
		//Read more: http://javarevisited.blogspot.com/2012/01/get-current-date-timestamps-java.html#ixzz3ZljoiTMx
				
		getInstance().getDb().getTreeMap(map).put(key + " " +localDateFormat.format( new Date()),value);
		getInstance().getDb().commit();
	}
	
	public static Object getValue(String map, String key) {
		return getInstance().getDb().getTreeMap(map).get(key);
	}
	
	public static NavigableSet<Object> getKeySet(String map) {
		return getInstance().getDb().getTreeMap(map).keySet();
	}
	
	public static void closeInstance() {
		synchronized(MapDataCache.class) {
			if(instance != null) {
				getInstance().getDb().commit();
				getInstance().getDb().close();
				instance = null;
			}
		}
	}
}
