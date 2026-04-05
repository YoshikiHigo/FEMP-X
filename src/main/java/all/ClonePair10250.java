package all;

public class ClonePair10250 {

    Integer method1(String aString){
      Integer result=null;
      if (aString != null && !aString.equals("")) {
        result=new Integer(aString);
      }
      return result;
    }

    Integer method2(String src){
      if (src == null || src.trim().length() == 0)   return null;
      return Integer.valueOf(src);
    }
}
