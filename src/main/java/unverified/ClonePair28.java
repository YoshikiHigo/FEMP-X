package unverified;

public class ClonePair28 {

    Long method1(String text){
      if (text == null) {
        return null;
      }
      Long number=null;
      try {
        number=Long.valueOf(text);
      }
     catch (  NumberFormatException e) {
      }
      return number;
    }

    Long method2(String s){
      if (s == null)   return null;
      Long rval=null;
      try {
        rval=new Long(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
