package unverified;

public class ClonePair10260 {

    Integer method1(String str){
      Integer integer=null;
      if (!"".equals(str) && str != null) {
        integer=Integer.valueOf(str);
      }
      return integer;
    }

    Integer method2(String iValue){
      Integer result=null;
      if (iValue != null && iValue.trim().length() > 0) {
        result=Integer.valueOf(iValue);
      }
      return result;
    }
}
