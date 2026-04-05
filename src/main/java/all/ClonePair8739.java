package all;

public class ClonePair8739 {

    int method1(String value,int defaultValue){
      int parsed=defaultValue;
      if (value != null) {
        try {
          parsed=Integer.parseInt(value);
        }
     catch (    NumberFormatException e) {
          parsed=defaultValue;
        }
      }
      return parsed;
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
