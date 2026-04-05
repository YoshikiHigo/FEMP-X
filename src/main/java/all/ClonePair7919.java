package all;

public class ClonePair7919 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return false;
      if (a == null)   return true;
      if (b == null)   return true;
      return (a.compareTo(b) != 0);
    }

    boolean method2(String str1,String str2){
      if ((str1 == null) && (str2 == null))   return false;
      if (str1 == null)   return true;
      if (str2 == null)   return true;
      return !str1.equals(str2);
    }
}
