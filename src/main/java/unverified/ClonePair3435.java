package unverified;

public class ClonePair3435 {

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
      Float floatValue;
      try {
        if (null == value || 0 == value.length()) {
          floatValue=null;
        }
     else {
          floatValue=Float.valueOf(value);
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return floatValue;
    }
}
