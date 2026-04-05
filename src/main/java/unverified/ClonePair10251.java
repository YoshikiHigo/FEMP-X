package unverified;

public class ClonePair10251 {

    Integer method1(String aString){
      Integer result=null;
      if (aString != null && !aString.equals("")) {
        result=new Integer(aString);
      }
      return result;
    }

    Integer method2(String iValue){
      Integer result=null;
      if (iValue != null && iValue.trim().length() > 0) {
        result=Integer.valueOf(iValue);
      }
      return result;
    }
}
