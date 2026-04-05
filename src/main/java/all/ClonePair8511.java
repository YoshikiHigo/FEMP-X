package all;

public class ClonePair8511 {

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

    Double method2(String value){
      if (value != null) {
        try {
          return Double.parseDouble(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
