package all;

public class ClonePair11013 {

    boolean method1(String boundary,byte ba[]){
      byte b;
      if (boundary == null || ba == null)   return false;
      for (int i=0; i < boundary.length(); i++)   if ((byte)boundary.charAt(i) != ba[i])   return false;
      return true;
    }

    boolean method2(String boundary,byte ba[]){
      if (boundary == null || ba == null)   return false;
      for (int i=0; i < boundary.length(); i++)   if ((byte)boundary.charAt(i) != ba[i])   return false;
      return true;
    }
}
