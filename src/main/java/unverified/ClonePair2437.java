package unverified;

public class ClonePair2437 {

    double method1(String str){
      str=str.replaceAll(",",".");
      if (!str.isEmpty()) {
        return Double.parseDouble(str);
      }
     else {
        return 0;
      }
    }

    double method2(String doubleval){
      if (doubleval.equals("")) {
        return 0;
      }
      return Double.valueOf(doubleval).doubleValue();
    }
}
