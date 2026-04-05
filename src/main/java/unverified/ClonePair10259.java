package unverified;

public class ClonePair10259 {

    Integer method1(String str){
      Integer integer=null;
      if (!"".equals(str) && str != null) {
        integer=Integer.valueOf(str);
      }
      return integer;
    }

    Integer method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }
}
