package unverified;

public class ClonePair3436 {

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
      if (s == null)   return null;
      try {
        return Float.parseFloat(s);
      }
     catch (  Exception e) {
        System.err.println("Error decoding Float-String '" + s + "'");
      }
      return null;
    }
}
