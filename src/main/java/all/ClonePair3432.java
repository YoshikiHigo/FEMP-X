package all;

public class ClonePair3432 {

    Float method1(String s){
      if (s == null)   return null;
      Float rval=null;
      try {
        rval=new Float(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }

    Float method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return Float.valueOf(value);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
