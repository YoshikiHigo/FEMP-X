package all;

public class ClonePair8422 {

    Double method1(String aString){
      Double result=null;
      if (aString != null && !aString.equals("")) {
        result=new Double(aString);
      }
      return result;
    }

    Double method2(String s){
      if (s == null || s.length() == 0) {
        return null;
      }
      if (s.endsWith("(sec)")) {
        return Double.parseDouble(s.substring(0,s.length() - "(sec)".length()));
      }
     else {
        return Double.parseDouble(s);
      }
    }
}
