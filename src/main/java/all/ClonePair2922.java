package all;

public class ClonePair2922 {

    double method1(String value){
      if (value == null || value.length() == 0)   return 0;
      double d=0;
      try {
        d=Double.parseDouble(value);
      }
     catch (  Exception e) {
        d=0;
      }
      return d;
    }

    double method2(String value){
      try {
        if (value == null || value.length() == 0) {
          return 0;
        }
     else {
          return Double.parseDouble(value);
        }
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
