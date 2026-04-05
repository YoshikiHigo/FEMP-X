package all;

public class ClonePair9027 {

    boolean method1(String str1,String str2){
      if (str1 == null)   return str2 != null;
      if (str2 == null)   return str1 != null;
      return !str1.equals(str2);
    }

    boolean method2(String str1,String str2){
      if ((str1 == null) && (str2 == null))   return false;
      if (str1 == null)   return true;
      if (str2 == null)   return true;
      return !str1.equals(str2);
    }
}
