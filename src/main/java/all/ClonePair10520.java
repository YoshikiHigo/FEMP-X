package all;

public class ClonePair10520 {

    Integer method1(String s){
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

    Integer method2(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  NumberFormatException nfe) {
        return null;
      }
    }
}
