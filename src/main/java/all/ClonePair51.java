package all;

public class ClonePair51 {

    Long method1(String string){
      if (string == null)   return null;
      try {
        return new Long(string);
      }
     catch (  NumberFormatException exception) {
        return null;
      }
    }

    Long method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Long(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
