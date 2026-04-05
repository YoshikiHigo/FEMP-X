package all;

public class ClonePair9464 {

    int method1(String a,String b){
      if (a == b)   return 0;
      if (a == null)   return -1;
      if (b == null)   return 1;
      double ad, bd;
      try {
        ad=Double.parseDouble(a);
      }
     catch (  NumberFormatException nfe) {
        return a.compareToIgnoreCase(b);
      }
      try {
        bd=Double.parseDouble(b);
      }
     catch (  NumberFormatException nfe) {
        return a.compareToIgnoreCase(b);
      }
      if (ad < bd)   return -1;
      if (ad > bd)   return 1;
      return 0;
    }

    int method2(String source1,String source2){
      if (source1 == null) {
        if (source2 == null)     return 0;
        return -1;
      }
      if (source2 == null)   return 1;
      int retVal=source1.compareToIgnoreCase(source2);
      if (retVal == 0)   return source1.compareTo(source2);
      return retVal;
    }
}
