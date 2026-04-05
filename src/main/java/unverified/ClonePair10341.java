package unverified;

public class ClonePair10341 {

    Integer method1(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString);
    }

    Integer method2(String value){
      if ((value != null) && (!"".equals(value))) {
        return new Integer(value);
      }
      return null;
    }
}
