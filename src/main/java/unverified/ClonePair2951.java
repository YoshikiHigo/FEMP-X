package unverified;

public class ClonePair2951 {

    double method1(String value){
      if (value.equals(""))   return 0;
      return Double.parseDouble(value);
    }

    double method2(String value){
      value=value.trim();
      if (value == null || value.equals(""))   return 0;
      return Double.parseDouble(value);
    }
}
