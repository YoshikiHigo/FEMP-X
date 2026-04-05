package unverified;

public class ClonePair3450 {

    Float method1(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  Exception ex) {
        return null;
      }
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
