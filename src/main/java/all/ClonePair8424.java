package all;

public class ClonePair8424 {

    Double method1(String aString){
      Double result=null;
      if (aString != null && !aString.equals("")) {
        result=new Double(aString);
      }
      return result;
    }

    Double method2(String dValue){
      Double result=null;
      if (dValue != null && dValue.trim().length() > 0) {
        result=Double.valueOf(dValue);
      }
      return result;
    }
}
