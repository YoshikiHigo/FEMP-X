package unverified;

public class ClonePair10763 {

    int method1(String key,int defaultValue){
      final String value=System.getProperty(key);
      if (null == value) {
        return defaultValue;
      }
      try {
        return Integer.parseInt(value);
      }
     catch (  final NumberFormatException e) {
        return defaultValue;
      }
    }

    int method2(String p,int defaultVal){
      String propString=System.getProperty(p);
      int returnVal=defaultVal;
      if (propString != null) {
        try {
          returnVal=Integer.parseInt(propString);
        }
     catch (    NumberFormatException e) {
        }
      }
      return returnVal;
    }
}
