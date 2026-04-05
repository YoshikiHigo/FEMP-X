package unverified;

public class ClonePair3265 {

    int method1(Object o1,Object o2){
      if (o1 == null && o2 == null) {
        return 0;
      }
     else   if (o1 == null) {
        return -1;
      }
     else   if (o2 == null) {
        return 1;
      }
      int result;
      if (o1 instanceof Comparable) {
        try {
          result=((Comparable)o1).compareTo(o2);
        }
     catch (    ClassCastException cce) {
          String s1=o1.toString();
          String s2=o2.toString();
          result=s1.compareTo(s2);
        }
      }
     else {
        String s1=o1.toString();
        String s2=o2.toString();
        result=s1.compareTo(s2);
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
