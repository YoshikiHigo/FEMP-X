package all;

public class ClonePair5899 {

    boolean method1(String str1,String str2){
      boolean match=false;
      if (str1 == null && str2 == null) {
        match=true;
      }
     else   if (str1 == null || str2 == null) {
        match=false;
      }
     else   if (str1.equals(str2)) {
        match=true;
      }
      return match;
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null)   return (s1 == s2);
     else   return s1.compareTo(s2) == 0;
    }
}
