package unverified;

public class ClonePair43 {

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

    Long method2(String string){
      if (string == null)   return null;
      try {
        return new Long(string);
      }
     catch (  NumberFormatException exception) {
        return null;
      }
    }
}
