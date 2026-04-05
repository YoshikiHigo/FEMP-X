package unverified;

public class ClonePair3266 {

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
