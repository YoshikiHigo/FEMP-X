package all;

public class ClonePair2705 {

    double method1(String s){
      if (s == null || s.length() == 0)   return (double)0;
     else   return Double.valueOf(s).doubleValue();
    }

    double method2(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }
}
