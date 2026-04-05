package all;

import java.util.Date;

public class ClonePair3221 {

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
      int result=0;
      if (o1 != null && o2 != null) {
        if (o1 instanceof Number && o2 instanceof Number) {
          result=Double.compare(((Number)o1).doubleValue(),((Number)o2).doubleValue());
        }
     else     if (o1.getClass() == o2.getClass() && o1 instanceof Comparable) {
          result=(((Comparable)o1).compareTo(o2));
        }
     else {
          System.out.println(String.format("Warning: compared values: %s, %s have different types",o1.toString(),o2.toString()));
          result=(o1.toString()).compareTo(o2.toString());
        }
      }
     else   if (o1 != null) {
        result=1;
      }
     else   if (o2 != null) {
        result=-1;
      }
      return result;
    }
}
