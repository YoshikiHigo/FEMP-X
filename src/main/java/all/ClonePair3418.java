package all;

public class ClonePair3418 {

    Float method1(String value){
      if (value != null) {
        try {
          return Float.parseFloat(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }

    Float method2(String s){
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
}
