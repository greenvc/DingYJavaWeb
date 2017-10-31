package API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 日期时间
 */
public class DateTimes {

	public static void main(String[] args) {
		Date objDate = new Date();
		System.out.println(objDate);
		
		
		   Calendar objCalendar = Calendar.getInstance();//得到当前时间
		   objCalendar.setTime(objDate);
           //年份
           int year = objCalendar.get(Calendar.YEAR);
           //月份
           int month = objCalendar.get(Calendar.MONTH) + 1;
           //日期
           int date = objCalendar.get(Calendar.DATE);
           //小时
           int hour = objCalendar.get(Calendar.HOUR_OF_DAY);
           //分钟
           int minute = objCalendar.get(Calendar.MINUTE);
           //秒
           int second = objCalendar.get(Calendar.SECOND);
           //星期
           int day = objCalendar.get(Calendar.DAY_OF_WEEK) - 1;
           System.out.println(year + " 年 " + month + " 月 " + date + " 日 " + hour + ":" + minute +":" + second + "  星期 " + day);
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
           System.out.println(sdf.format(objDate));
	}
}