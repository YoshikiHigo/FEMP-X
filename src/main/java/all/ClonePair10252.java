package all;

public class ClonePair10252 {

    Integer method1(String aString){
      Integer result=null;
      if (aString != null && !aString.equals("")) {
        result=new Integer(aString);
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
