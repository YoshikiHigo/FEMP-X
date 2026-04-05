package all;

public class ClonePair9066 {

    int method1(String strData,int defaultValue){
      int i=defaultValue;
      if (strData == null || strData.equals("")) {
        i=defaultValue;
      }
     else {
        try {
          i=Integer.parseInt(strData);
        }
     catch (    NumberFormatException e) {
          return defaultValue;
        }
      }
      return i;
    }

    int method2(String v,int dflt){
      if (v != null) {
        try {
          dflt=Integer.decode(v).intValue();
        }
     catch (    Exception exc) {
        }
      }
      return dflt;
    }
}
