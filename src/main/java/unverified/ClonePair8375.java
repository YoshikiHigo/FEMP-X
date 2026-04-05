package unverified;

public class ClonePair8375 {

    boolean method1(String v1,String v2){
      if (v1 == null && v2 == null)   return false;
      if (v1 == null || v2 == null)   return true;
      return !v1.equals(v2);
    }

    boolean method2(String str1,String str2){
      if (str1 == null)   return str2 != null;
      if (str2 == null)   return str1 != null;
      return !str1.equals(str2);
    }
}
