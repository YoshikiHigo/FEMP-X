package all;

public class ClonePair8522 {

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
