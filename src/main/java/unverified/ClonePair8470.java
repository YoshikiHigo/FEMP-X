package unverified;

public class ClonePair8470 {

    Double method1(String s){
      try {
        if (s != null) {
          return Double.parseDouble(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Double method2(String text){
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
}
