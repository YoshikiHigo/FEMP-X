package all;

public class ClonePair3063 {

    double method1(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Double(str).doubleValue());
    }

    double method2(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }
}
