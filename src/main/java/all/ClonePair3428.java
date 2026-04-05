package all;

public class ClonePair3428 {

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
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  Exception ex) {
        return null;
      }
    }
}
