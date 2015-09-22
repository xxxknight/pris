package com.test.util;

import java.util.Calendar;

public class DateUtil {
	public static String generateDateString(int type) {
		Calendar cal = Calendar.getInstance();
		String year = String.valueOf(cal.get(Calendar.YEAR));
		String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		String day = String.valueOf(cal.get(Calendar.DATE));
		String hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		String milliSecond = String.valueOf(cal.get(Calendar.MILLISECOND));

		String res = "";
		switch (type) {
		case 0:
			res = year + month + day;
			break;

		case 1:
			res = year + "-" + month + "-" + day;
			break;

		case 2:
			res = year + "年" + month + "月" + day + "日";
			break;

		case 3:
			res = year + month + day + hour + minute + second;
			break;

		case 4:
			res = year + month + day + hour + minute + second + milliSecond;
			break;

		default:
			res = year + month + day;
			break;
		}

		return res;

	}

	public static void main(String[] args) {
		System.out.println(DateUtil.generateDateString(0));
	}

}
