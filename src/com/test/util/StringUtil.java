package com.test.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �ַ�����
 * 
 * @author lenovo
 * 
 */
public class StringUtil {

	public static void main(String[] args) {
		// readFile("F:/upload");"���ط��ռ�(�����ϴ�).txt"
		// System.out.println(DateUtil.getTime());
		String str = "sdfds(1)";
		System.out.println(fileName(str));
	}

	/**
	 * �����ظ��ļ���(����)
	 * 
	 * @param str
	 * @return
	 */
	public static String fileName(String str) {
		System.out.println(str.endsWith(")"));
		if ((str.length() - str.lastIndexOf("(")) == 3 && str.endsWith(")")) {
			String middstr = str.substring((str.lastIndexOf("(") + 1), str
					.length() - 1);
			if (isNumeric(middstr)) {// ���ڲ���������
				int num = Integer.valueOf(middstr) + 1;
				str = str.substring(0, (str.lastIndexOf("(") + 1));
				str += num + ")";
			} else {// ���ڵ���������
				str += "(1)";
			}

		} else {
			str += "(1)";
		}
		return str;
	}

	/**
	 * �ж��Ƿ�������
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	public static void deleteSwfFile(String filepath, String fielName) {
		File file = new File(filepath);
		if (file.isDirectory()) {// �Ƿ����ļ���
			String[] fileList = file.list();
			for (int i = 0; i < fileList.length; i++) {
				File readfile = new File(filepath + "\\" + fileList[i]);
				if (readfile.getName().startsWith(fielName)) {
					System.out.println(readfile.getName());
					if (!readfile.isDirectory()) {
						readfile.delete();
					}
				}
			}
		}
	}

	/**
	 * ������ת��Unicode��ȥ��\
	 * 
	 * @param str
	 * @return
	 */
	public static String chinaToUni(String str) {
		if (str == null || "".equals(str)) {
			return "";
		}
		return chinaToUnicode(str).replaceAll("[\\\\]", "");
	}

	/**
	 * ������ת��Unicode��
	 * 
	 * @param str
	 *            �ַ�
	 * @return
	 */
	public static String chinaToUnicode(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int chr1 = (char) str.charAt(i);
			if (chr1 >= 19968 && chr1 <= 171941) {// ���ַ�Χ \u4e00-\u9fa5 (����)
				result += "\\u" + Integer.toHexString(chr1);
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

	/**
	 * �Ƿ�Ϊ��
	 * 
	 * @param s
	 *            �ַ�
	 * @return true��false
	 */
	public static boolean isNull(String s) {
		if (s == null) {
			return true;
		}
		s = s.trim();

		if ((s.toLowerCase().equals(StringPool.NULL))
				|| (s.equals(StringPool.BLANK))) {
			return true;
		}

		return false;
	}

	/**
	 * �ַ�text��s�г��ִ���
	 * 
	 * @param s
	 *            ��У���ַ�
	 * @param text
	 *            У���ַ�
	 * @return count ���ִ���
	 */
	public static int count(String s, String text) {
		if ((s == null) || (text == null)) {
			return 0;
		}

		int count = 0;

		int pos = s.indexOf(text);

		while (pos != -1) {
			pos = s.indexOf(text, pos + text.length());
			count++;
		}

		return count;
	}

	/**
	 * �ж�s�Ƿ���end(�ַ�)��β
	 * 
	 * @param s
	 *            ��У���ַ�
	 * @param end
	 *            У���ַ�
	 * @return true��false
	 */
	public static boolean endsWith(String s, char end) {
		return endsWith(s, (new Character(end)).toString());
	}

	/**
	 * �ж�s�Ƿ���end(�ַ�)��β
	 * 
	 * @param s
	 *            ��У���ַ�
	 * @param end
	 *            У���ַ�
	 * @return true��false
	 */
	public static boolean endsWith(String s, String end) {
		if ((s == null) || (end == null)) {
			return false;
		}

		if (end.length() > s.length()) {
			return false;
		}

		String temp = s.substring(s.length() - end.length(), s.length());

		if (temp.equalsIgnoreCase(end)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж��Ƿ����ַ�
	 * 
	 * @param c
	 *            �ַ�
	 * @return true��false
	 */
	public static boolean isChar(char c) {
		return Character.isLetter(c);
	}

	/**
	 * ���delimiter�и��ַ�s,���طָ���ǰһ�����ַ�
	 * 
	 * @param s
	 *            �ַ�
	 * @param delimiter
	 *            �ָ���
	 * @return ���طָ���ǰһ�����ַ�
	 */
	public static String extractFirst(String s, String delimiter) {
		if (s == null) {
			return null;
		} else {
			String[] array = split(s, delimiter);

			if (array.length > 0) {
				return array[0];
			} else {
				return null;
			}
		}
	}

	/**
	 * ���delimiter�и��ַ�s,���طָ����һ�����ַ�
	 * 
	 * @param s
	 *            �ַ�
	 * @param delimiter
	 *            �ָ���
	 * @return ���طָ����һ�����ַ�
	 */
	public static String extractLast(String s, String delimiter) {
		if (s == null) {
			return null;
		} else {
			String[] array = split(s, delimiter);

			if (array.length > 0) {
				return array[array.length - 1];
			} else {
				return null;
			}
		}
	}

	/**
	 * ��дתСд
	 * 
	 * @param s
	 *            �ַ�
	 * @return ����Сд�ַ�
	 */
	public static String lowerCase(String s) {
		if (s == null) {
			return null;
		} else {
			return s.toLowerCase();
		}
	}

	/**
	 * ��,Ϊ�ָ���ϲ�list
	 * 
	 * @param list
	 *            ����
	 * @return �ϲ�����ַ�
	 */
	public static String merge(List list) {
		return merge(list, StringPool.COMMA);
	}

	/**
	 * ���Զ���delimiter(�ָ���)�ϲ�list
	 * 
	 * @param list
	 *            ����
	 * @param delimiter
	 *            �ָ���
	 * @return �ϲ�����ַ�
	 */
	public static String merge(List list, String delimiter) {
		return merge((String[]) list.toArray(new String[0]), delimiter);
	}

	/**
	 * ��,Ϊ�ָ���ϲ�����
	 * 
	 * @param array
	 *            ����
	 * @return �ϲ�����ַ�
	 */
	public static String merge(String[] array) {
		return merge(array, StringPool.COMMA);
	}

	/**
	 * ���Զ���delimiter(�ָ���)�ϲ�����
	 * 
	 * @param array
	 *            ����
	 * @param delimiter
	 *            �ָ���
	 * @return �ϲ�����ַ�
	 */
	public static String merge(String[] array, String delimiter) {
		if (array == null) {
			return null;
		}

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < array.length; i++) {
			sb.append(array[i].trim());

			if ((i + 1) != array.length) {
				sb.append(delimiter);
			}
		}

		return sb.toString();
	}

	/**
	 * �Ƿ�Ϊnull
	 * 
	 * @param s
	 *            �ַ�
	 * @return true��false
	 */
	public static boolean isNotNull(String s) {
		return !isNull(s);
	}

	/**
	 * ��,�и��ַ�
	 * 
	 * @param s
	 * @return
	 */
	public static String[] split(String s) {
		return split(s, StringPool.COMMA);
	}

	/**
	 * @author
	 * @version ����ʱ�䣺2008-4-25 ����10:37:47
	 * @function ����һ���Ӵ��ڸ������ֵĸ���
	 * @parameter String s���ַ�
	 * @parameter String delimiter���ַ�
	 * @return int���س��ֵĴ���
	 */
	public static int indexOf(String s, String delimiter) {
		int count = 0;
		if (isNotNull(s) && isNotNull(delimiter)) {
			String[] splits = split(s, delimiter);
			if (splits != null && splits.length > 1)
				count = splits.length - 1;
		}
		return count;
	}

	/**
	 * ��delimiter(�ָ���)�и��ַ�
	 * 
	 * @param s
	 *            �ַ�
	 * @param delimiter
	 *            �ָ���
	 * @return String[]
	 */
	public static String[] split(String s, String delimiter) {
		if (s == null || delimiter == null) {
			return new String[0];
		}

		s = s.trim();

		if (!s.endsWith(delimiter)) {
			s += delimiter;
		}

		if (s.equals(delimiter)) {
			return new String[0];
		}

		List nodeValues = new ArrayList();

		if (delimiter.equals("\n") || delimiter.equals("\r")) {
			try {
				BufferedReader br = new BufferedReader(new StringReader(s));

				String line = null;

				while ((line = br.readLine()) != null) {
					nodeValues.add(line);
				}

				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			int offset = 0;
			int pos = s.indexOf(delimiter, offset);

			while (pos != -1) {
				nodeValues.add(s.substring(offset, pos));

				offset = pos + delimiter.length();
				pos = s.indexOf(delimiter, offset);
			}
		}

		return (String[]) nodeValues.toArray(new String[0]);
	}

	/**
	 * �ж�s(�ַ�)�Ƿ���begin(�ַ�)��ʼ
	 * 
	 * @param s
	 *            �ַ�
	 * @param begin
	 *            �ַ�
	 * @return true,false
	 */
	public static boolean startsWith(String s, char begin) {
		return startsWith(s, (new Character(begin)).toString());
	}

	/**
	 * �ж�s(�ַ�)�Ƿ���start(�ַ�)��ʼ
	 * 
	 * @param s
	 *            �ַ�
	 * @param start
	 *            ��ʼ�ַ�
	 * @return true,false
	 */
	public static boolean startsWith(String s, String start) {
		if ((s == null) || (start == null)) {
			return false;
		}

		if (start.length() > s.length()) {
			return false;
		}

		String temp = s.substring(0, start.length());

		if (temp.equalsIgnoreCase(start)) {
			return true;
		} else {
			return false;
		}
	}
}
