package all;

public class ClonePair10249 {

    Integer method1(String aString){
      Integer result=null;
      if (aString != null && !aString.equals("")) {
        result=new Integer(aString);
      }
      return result;
    }

    Integer method2(String source){
      if (source == null || source.trim().isEmpty()) {
        return null;
      }
      return Integer.valueOf(source);
    }
}
