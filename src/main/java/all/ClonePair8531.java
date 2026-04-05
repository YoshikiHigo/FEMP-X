package all;

public class ClonePair8531 {

    Double method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Double(value);
      }
     catch (  NumberFormatException e) {
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
