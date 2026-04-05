package unverified;

public class ClonePair10243 {

    Integer method1(String aString){
      Integer result=null;
      if (aString != null && !aString.equals("")) {
        result=new Integer(aString);
      }
      return result;
    }

    Integer method2(String string){
      if (string != null && string.length() != 0) {
        return Integer.valueOf(string);
      }
      return null;
    }
}
