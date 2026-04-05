package unverified;

public class ClonePair8544 {

    Double method1(String value){
      if (value != null) {
        try {
          return Double.parseDouble(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
