package all;

public class ClonePair3429 {

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

    Float method2(String s){
      try {
        if (s != null) {
          return Float.parseFloat(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
