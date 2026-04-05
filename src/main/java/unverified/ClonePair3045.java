package unverified;

public class ClonePair3045 {

    double method1(String value){
      value=value.trim();
      if (value == null || value.equals(""))   return 0;
      return Double.parseDouble(value);
    }

    double method2(String doubleval){
      if (doubleval.equals("")) {
        return 0;
      }
      return Double.valueOf(doubleval).doubleValue();
    }
}
