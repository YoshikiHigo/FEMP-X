package unverified;

public class ClonePair29 {

    Long method1(String text){
      if (text == null) {
        return null;
      }
      Long number=null;
      try {
        number=Long.valueOf(text);
      }
     catch (  NumberFormatException e) {
      }
      return number;
    }

    Long method2(String string){
      if (string == null)   return null;
      try {
        return new Long(string);
      }
     catch (  NumberFormatException exception) {
        return null;
      }
    }
}
