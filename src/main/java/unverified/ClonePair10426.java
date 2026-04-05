package unverified;

public class ClonePair10426 {

    Integer method1(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Integer.valueOf(source);
    }

    Integer method2(String iValue){
      Integer result=null;
      if (iValue != null && iValue.trim().length() > 0) {
        result=Integer.valueOf(iValue);
      }
      return result;
    }
}
