package unverified;

public class ClonePair10110 {

    Integer method1(String source){
      if (source == null) {
        return null;
      }
      try {
        return Integer.parseInt(source);
      }
     catch (  Exception e) {
        return null;
      }
    }

    Integer method2(String s){
      if (s == null)   return null;
      Integer rval=null;
      try {
        rval=new Integer(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
