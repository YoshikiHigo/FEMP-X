package all;

public class ClonePair3101 {

    double method1(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }

    double method2(String s){
      if (s == null || s.length() == 0) {
        return 0.0;
      }
     else {
        return Double.parseDouble(s);
      }
    }
}
