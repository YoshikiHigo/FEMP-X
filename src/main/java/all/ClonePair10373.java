package all;

public class ClonePair10373 {

    Integer method1(String value){
      if ((value != null) && (!"".equals(value))) {
        return new Integer(value);
      }
      return null;
    }

    Integer method2(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString.trim());
    }
}
