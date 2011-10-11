package com.tomslabs.grid.avro;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class DateUtility {

  private DateUtility() {
  }

  public static String now(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());
  }

}
