package unverified;

public class ClonePair10299 {

    Integer method1(String indent){
      if (indent == null) {
        return null;
      }
     else {
        try {
          return Integer.parseInt(indent);
        }
     catch (    NumberFormatException e) {
          return null;
        }
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
