package all;

public class ClonePair3099 {

    double method1(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }

    double method2(String s){
      if (s != null && s.trim().length() > 0) {
        return Double.parseDouble(s);
      }
      return 0.0;
    }
}
