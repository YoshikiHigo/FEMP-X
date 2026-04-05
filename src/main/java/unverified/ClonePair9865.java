package unverified;

public class ClonePair9865 {

    int method1(String str1,String str2){
      int i;
      for (i=0; i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i); ++i)   ;
      return i;
    }

    int method2(String s,String t){
      int i=0;
      final int MAX=(s.length() < t.length()) ? s.length() : t.length();
      if (s.isEmpty() || t.isEmpty())   return i;
      while (i < MAX) {
        if (s.charAt(i) != t.charAt(i))     break;
        i++;
      }
      return i;
    }
}
