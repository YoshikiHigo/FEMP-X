package unverified;

public class ClonePair2514 {

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

    Short method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Short(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
