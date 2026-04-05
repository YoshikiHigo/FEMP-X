package all;

public class ClonePair8945 {

    int method1(String key,int dflt){
      String property=System.getProperty(key);
      if (property == null) {
        return dflt;
      }
      try {
        int value=Integer.parseInt(property);
        return (value < 0 ? dflt : value);
      }
     catch (  NumberFormatException exc) {
        return dflt;
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
