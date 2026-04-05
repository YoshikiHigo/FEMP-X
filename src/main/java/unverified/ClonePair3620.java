package unverified;

public class ClonePair3620 {

    int method1(Object arg0,Object arg1){
      String str1=(String)arg0;
      String str2=(String)arg1;
      try {
        Integer i1=Integer.parseInt(str1);
        Integer i2=Integer.parseInt(str2);
        if (i1 > i2) {
          return 1;
        }
     else     if (i1 < i2) {
          return -1;
        }
     else {
          return 0;
        }
      }
     catch (  Exception e) {
        return str1.compareTo(str2);
      }
    }

    int method2(Object o1,Object o2){
      String s1=(String)o1;
      String s2=(String)o2;
      int i1=s1.indexOf('-');
      int i2=s2.indexOf('-');
      if (i1 != -1) {
        s1=s1.substring(0,i1);
      }
      if (i2 != -1) {
        s2=s2.substring(0,i2);
      }
      try {
        long l1=Long.parseLong(s1);
        long l2=Long.parseLong(s2);
        if (l1 < l2) {
          return -1;
        }
     else     if (l1 > l2) {
          return 1;
        }
      }
     catch (  NumberFormatException e) {
      }
      return s1.compareTo(s2);
    }
}
