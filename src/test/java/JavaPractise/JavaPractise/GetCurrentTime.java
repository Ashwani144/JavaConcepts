package JavaPractise.JavaPractise;

import java.text.SimpleDateFormat;
import java.util.Date;


public class GetCurrentTime {

	public static void main(String[] args) {

		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		
		Date date=new Date();
		
		System.out.println(date);
	}

}
