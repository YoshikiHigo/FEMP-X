package unverified;

public class ClonePair3460 {

    Float method1(String value){
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
