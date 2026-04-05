package all;

public class ClonePair8509 {

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

    Double method2(String str){
      if (str == null) {
        return null;
      }
      try {
        return Double.valueOf(str);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
