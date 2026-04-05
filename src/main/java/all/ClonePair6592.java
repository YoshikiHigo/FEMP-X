package all;

import java.util.*;

public class ClonePair6592 {

    String method1(int month){
      if (Calendar.JANUARY == month) {
        return "January";
      }
     else   if (Calendar.FEBRUARY == month) {
        return "February";
      }
     else   if (Calendar.MARCH == month) {
        return "March";
      }
     else   if (Calendar.APRIL == month) {
        return "April";
      }
     else   if (Calendar.MAY == month) {
        return "May";
      }
     else   if (Calendar.JUNE == month) {
        return "June";
      }
     else   if (Calendar.JULY == month) {
        return "July";
      }
     else   if (Calendar.AUGUST == month) {
        return "August";
      }
     else   if (Calendar.SEPTEMBER == month) {
        return "September";
      }
     else   if (Calendar.OCTOBER == month) {
        return "October";
      }
     else   if (Calendar.NOVEMBER == month) {
        return "November";
      }
     else   if (Calendar.DECEMBER == month) {
        return "December";
      }
      return null;
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
