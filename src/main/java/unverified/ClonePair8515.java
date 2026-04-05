package unverified;

public class ClonePair8515 {

    Double method1(String text){
      if (text == null) {
        return null;
      }
      Double number=null;
      try {
        number=Double.valueOf(text);
      }
     catch (  NumberFormatException e) {
      }
      return number;
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
