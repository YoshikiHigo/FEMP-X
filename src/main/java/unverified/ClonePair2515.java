package unverified;

public class ClonePair2515 {

    Short method1(String s){
      if (s == null)   return null;
      Short rval=null;
      try {
        rval=new Short(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }

    Short method2(String s){
      try {
        if (s != null) {
          return Short.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
