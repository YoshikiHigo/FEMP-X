package all;

public class ClonePair17 {

    Long method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return Long.valueOf(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
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
