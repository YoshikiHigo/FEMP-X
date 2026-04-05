package unverified;

public class ClonePair44 {

    Long method1(String s){
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

    Long method2(String text){
      if (text == null) {
        return null;
      }
      try {
        return (Long.parseLong(text));
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
