package unverified;

public class ClonePair8426 {

    Double method1(String aString){
      Double result=null;
      if (aString != null && !aString.equals("")) {
        result=new Double(aString);
      }
      return result;
    }

    Double method2(String token){
      if (token != null && !"".equals(token.trim())) {
        return Double.valueOf(token);
      }
     else {
        return null;
      }
    }
}
