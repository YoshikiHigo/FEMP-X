package unverified;

public class ClonePair10903 {

    int method1(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
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
