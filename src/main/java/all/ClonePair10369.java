package all;

public class ClonePair10369 {

    Integer method1(String value){
      if ((value != null) && (!"".equals(value))) {
        return new Integer(value);
      }
      return null;
    }

    Integer method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }
}
