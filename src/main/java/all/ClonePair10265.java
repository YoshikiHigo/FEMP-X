package all;

public class ClonePair10265 {

    Integer method1(String string){
      if (string != null && string.length() != 0) {
        return Integer.valueOf(string);
      }
      return null;
    }

    Integer method2(String value){
      if ((value != null) && (!"".equals(value))) {
        return new Integer(value);
      }
      return null;
    }
}
