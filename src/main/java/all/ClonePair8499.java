package all;

public class ClonePair8499 {

    Double method1(String string){
      if (string == null)   return null;
      try {
        return new Double(string.trim());
      }
     catch (  Exception e) {
        return null;
      }
    }

    Double method2(String s){
      if (s == null)   return null;
      Double rval=null;
      try {
        rval=new Double(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
