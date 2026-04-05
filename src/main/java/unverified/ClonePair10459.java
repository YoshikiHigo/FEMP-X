package unverified;

public class ClonePair10459 {

    Integer method1(String str){
      if (str == null || str.equals("")) {
        return null;
      }
      try {
        return Integer.valueOf(str);
      }
     catch (  NumberFormatException e) {
      }
      return null;
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
