package unverified;

public class ClonePair2966 {

    double method1(String e){
      if (e == null || e.length() == 0)   return 0.0;
      if (e.charAt(0) == 'e' || e.charAt(0) == 'E')   return Double.parseDouble("1" + e);
     else   return Double.parseDouble(e);
    }

    double method2(String string){
      if (string == null)   return 0.0;
     else   if (string.trim().equals(""))   return 0.0;
     else   return Double.valueOf(string);
    }
}
