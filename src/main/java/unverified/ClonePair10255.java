package unverified;

public class ClonePair10255 {

    Integer method1(String str){
      Integer integer=null;
      if (!"".equals(str) && str != null) {
        integer=Integer.valueOf(str);
      }
      return integer;
    }

    Integer method2(String value){
      if ((value != null) && (!"".equals(value))) {
        return new Integer(value);
      }
      return null;
    }
}
