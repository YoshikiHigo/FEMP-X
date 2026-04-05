package all;

public class ClonePair8512 {

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
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      Double doubleObject=null;
      try {
        doubleObject=Double.valueOf(str);
      }
     catch (  Exception e) {
      }
      return doubleObject;
    }
}
