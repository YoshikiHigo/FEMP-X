package all;

public class ClonePair10261 {

    Integer method1(String str){
      Integer integer=null;
      if (!"".equals(str) && str != null) {
        integer=Integer.valueOf(str);
      }
      return integer;
    }

    Integer method2(String aString){
      if (aString == null || aString.trim().length() == 0) {
        return null;
      }
      return Integer.parseInt(aString.trim());
    }
}
