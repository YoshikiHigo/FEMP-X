package all;

public class ClonePair10543 {

    Integer method1(String iValue){
      Integer result=null;
      if (iValue != null && iValue.trim().length() > 0) {
        result=Integer.valueOf(iValue);
      }
      return result;
    }

    Integer method2(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString.trim());
    }
}
