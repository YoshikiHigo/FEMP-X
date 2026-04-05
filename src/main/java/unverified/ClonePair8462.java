package unverified;

public class ClonePair8462 {

    Double method1(String doubleNumber){
      if (doubleNumber == null)   return null;
      try {
        return new Double(doubleNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }

    Double method2(String s){
      if (s == null)   return null;
      Double rval=null;
      try {
        rval=new Double(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
