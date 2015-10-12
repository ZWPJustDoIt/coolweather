package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

/*	
 * Province表 建表语句
 * */
	public static final String CREATE_PROVINCE = "create table Province(" +
			"id integer primary key autoincrement, "
			+ "province_name text"
			+ "province_code text)";
	/*	
	 * City表 建表语句
	 * */
	
	public  static final String CREATE_CITY =  "create table City("
			+"id integer primary key autoincrement, "
			+"city_name text,  "
			+"city_code text,  "
			+"province_id integer)";
	/*	
	 * County表 建表语句
	 * */
	public static final String CREATE_COUNTY ="create table County("
			+"id integer primary key autoincrement, "
			+"county_name text, "
			+"county_code text, "
			+"city_id integer)";
			
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	        db.execSQL(CREATE_PROVINCE);//创建Province表
	        db.execSQL(CREATE_CITY);//创建City表
	        db.execSQL(CREATE_COUNTY);//创建County表
	        

	}
/*	上面的代码的理解：
 *                将三条建表语句定义成常量，然后再onCreate()方法中去执行创建就可以了。
 *                另外每张表在代码中最好能有一个对应的实体类，这样会非常方便于我们后续的开发*/

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    

	}

}
