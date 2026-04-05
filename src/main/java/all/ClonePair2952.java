package all;

public class ClonePair2952 {

    double method1(String value){
      if (value.equals(""))   return 0;
      return Double.parseDouble(value);
    }

    double method2(String doubleval){
      if (doubleval.equals("")) {
        return 0;
      }
      return Double.valueOf(doubleval).doubleValue();
    }
}
