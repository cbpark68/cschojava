package cscho.java.basic;

import java.util.Calendar;

public class Study12 {

	public static void main(String[] args) {
		System.out.println("회원이름:"+memberName());
		System.out.println("회원나이:"+memberAge());
		System.out.println("회원생일:"+memberBirthday());
		System.out.println("오늘날짜:"+today());
	}
	public static String memberName() {
		return "홍길동";
	}
	public static int memberAge() {
		return 18;
	}
	public static String memberBirthday() {
		return "1988-07-07";
	}
	public static String today() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String mm = (month<10)?"0"+month:""+month;
		String dd = (date<10)?"0"+date:""+date;
		String today = year+"-"+mm+"-"+dd;
		return today;
	}

}
