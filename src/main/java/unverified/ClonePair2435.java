package unverified;

public class ClonePair2435 {

    double method1(String str){
      str=str.replaceAll(",",".");
      if (!str.isEmpty()) {
        return Double.parseDouble(str);
      }
     else {
        return 0;
      }
    }

    double method2(String value){
      value=value.trim();
      if (value == null || value.equals(""))   return 0;
      return Double.parseDouble(value);
    }
}
