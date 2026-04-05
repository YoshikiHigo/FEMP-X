package unverified;

import java.util.Date;

public class ClonePair3222 {

    int method1(Object first,Object second){
      int result=0;
      if (first == null && second == null) {
        result=0;
      }
     else   if (first == null) {
        result=-1;
      }
     else   if (second == null) {
        result=1;
      }
     else   if (first instanceof Date && second instanceof Date) {
        result=((Date)first).compareTo((Date)second);
      }
     else   if (first instanceof Integer && second instanceof Integer) {
        result=((Integer)first).compareTo((Integer)second);
      }
     else   if (first instanceof Double && second instanceof Double) {
        result=((Double)first).compareTo((Double)second);
      }
     else {
        result=first.toString().compareTo(second.toString());
      }
      return result;
    }

    int method2(Object o1,Object o2){
      if (o1 == null && o2 == null) {
        return 0;
      }
     else   if (o1 == null) {
        return -1;
      }
     else   if (o2 == null) {
        return 1;
      }
     else   if (o1 == o2 || o1.equals(o2)) {
        return 0;
      }
     else   if (!o1.getClass().equals(o2.getClass())) {
        return o1.getClass().getName().compareTo(o2.getClass().getName());
      }
     else   if (o1 instanceof Comparable && o2 instanceof Comparable) {
        return ((Comparable)o1).compareTo(o2);
      }
     else {
        int h1=o1.hashCode();
        int h2=o2.hashCode();
        return h1 > h2 ? 1 : -1;
      }
    }
}
