package all;

import java.util.*;

public class ClonePair8899 {

    String method1(int month){
      String result=null;
      if (month == Calendar.JANUARY) {
        result="January";
      }
     else   if (month == Calendar.FEBRUARY) {
        result="February";
      }
     else   if (month == Calendar.MARCH) {
        result="March";
      }
     else   if (month == Calendar.APRIL) {
        result="April";
      }
     else   if (month == Calendar.MAY) {
        result="May";
      }
     else   if (month == Calendar.JUNE) {
        result="June";
      }
     else   if (month == Calendar.JULY) {
        result="July";
      }
     else   if (month == Calendar.AUGUST) {
        result="August";
      }
     else   if (month == Calendar.SEPTEMBER) {
        result="September";
      }
     else   if (month == Calendar.OCTOBER) {
        result="October";
      }
     else   if (month == Calendar.NOVEMBER) {
        result="November";
      }
     else   if (month == Calendar.DECEMBER) {
        result="December";
      }
      return result;
    }

    String method2(int i){
    switch (i) {
    case 0:    return "January";
    case 1:  return "February";
    case 2:return "March";
    case 3:return "April";
    case 4:return "May";
    case 5:return "June";
    case 6:return "July";
    case 7:return "August";
    case 8:return "September";
    case 9:return "October";
    case 10:return "November";
    case 11:return "December";
    }
    return null;
    }
}
