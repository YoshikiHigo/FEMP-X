package all;

public class ClonePair10253 {

    Integer method1(String str){
      Integer integer=null;
      if (!"".equals(str) && str != null) {
        integer=Integer.valueOf(str);
      }
      return integer;
    }

    Integer method2(String string){
      if (string != null && string.length() != 0) {
        return Integer.valueOf(string);
      }
      return null;
    }
}
