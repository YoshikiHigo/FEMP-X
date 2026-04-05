package all;

public class ClonePair8520 {

    Double method1(String str){
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

    Double method2(String value){
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
}
