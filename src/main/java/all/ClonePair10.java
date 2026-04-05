package all;

public class ClonePair10 {

    Long method1(String s){
      try {
        if (s != null) {
          return Long.decode(s);
        }
     else {
          return null;
        }
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
