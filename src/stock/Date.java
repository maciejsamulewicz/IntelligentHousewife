package stock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {

DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd");
Date date = new Date();

public DateFormat createDate(DateFormat dateFormat){
	
dateFormat.format(date);
	return dateFormat;
}
	
}
