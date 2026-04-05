package all;

import java.util.*;

public class ClonePair7155 {

    int method1(int month){
    switch (month) {
    case Calendar.JANUARY:    return 1;
    case Calendar.FEBRUARY:  return 2;
    case Calendar.MARCH:return 3;
    case Calendar.APRIL:return 4;
    case Calendar.MAY:return 5;
    case Calendar.JUNE:return 6;
    case Calendar.JULY:return 7;
    case Calendar.AUGUST:return 8;
    case Calendar.SEPTEMBER:return 9;
    case Calendar.OCTOBER:return 10;
    case Calendar.NOVEMBER:return 11;
    case Calendar.DECEMBER:return 12;
    }
    return 1;
    }

    int method2(int calendarMonth){
      if (calendarMonth == Calendar.JANUARY) {
        return 1;
      }
     else   if (calendarMonth == Calendar.FEBRUARY) {
        return 2;
      }
     else   if (calendarMonth == Calendar.MARCH) {
        return 3;
      }
     else   if (calendarMonth == Calendar.APRIL) {
        return 4;
      }
     else   if (calendarMonth == Calendar.MAY) {
        return 5;
      }
     else   if (calendarMonth == Calendar.JUNE) {
        return 6;
      }
     else   if (calendarMonth == Calendar.JULY) {
        return 7;
      }
     else   if (calendarMonth == Calendar.AUGUST) {
        return 8;
      }
     else   if (calendarMonth == Calendar.SEPTEMBER) {
        return 9;
      }
     else   if (calendarMonth == Calendar.OCTOBER) {
        return 10;
      }
     else   if (calendarMonth == Calendar.NOVEMBER) {
        return 11;
      }
     else   if (calendarMonth == Calendar.DECEMBER) {
        return 12;
      }
     else {
        return 1;
      }
    }
}
