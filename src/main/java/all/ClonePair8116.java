package all;

import java.util.*;

public class ClonePair8116 {

    int method1(GregorianCalendar cal1,GregorianCalendar cal2){
      int mes1=cal1.get(GregorianCalendar.MONTH);
      int ano1=cal1.get(GregorianCalendar.YEAR);
      int dia1=cal1.get(GregorianCalendar.DAY_OF_MONTH);
      int mes2=cal2.get(GregorianCalendar.MONTH);
      int ano2=cal2.get(GregorianCalendar.YEAR);
      int dia2=cal2.get(GregorianCalendar.DAY_OF_MONTH);
      if (ano1 > ano2) {
        return 1;
      }
     else   if (ano2 > ano1) {
        return -1;
      }
     else   if (mes1 > mes2) {
        return 1;
      }
     else   if (mes2 > mes1) {
        return -1;
      }
     else   if (dia1 > dia2) {
        return 1;
      }
     else   if (dia2 > dia1) {
        return -1;
      }
     else {
        return 0;
      }
    }

    int method2(GregorianCalendar comparada,GregorianCalendar fecha){
      int comparacion=0;
      int ano1=comparada.get(Calendar.YEAR);
      int mes1=comparada.get(Calendar.MONTH);
      int dia1=comparada.get(Calendar.DAY_OF_MONTH);
      int ano2=fecha.get(Calendar.YEAR);
      int mes2=fecha.get(Calendar.MONTH);
      int dia2=fecha.get(Calendar.DAY_OF_MONTH);
      if (ano1 == ano2) {
        if (mes1 == mes2) {
          if (dia1 == dia2) {
            comparacion=0;
          }
     else       if (dia1 < dia2) {
            comparacion=-1;
          }
     else       if (dia1 > dia2) {
            comparacion=1;
          }
        }
     else     if (mes1 < mes2) {
          comparacion=-1;
        }
     else     if (mes1 > mes2) {
          comparacion=1;
        }
      }
     else   if (ano1 < ano2) {
        comparacion=-1;
      }
     else   if (ano1 > ano2) {
        comparacion=1;
      }
      return comparacion;
    }
}
