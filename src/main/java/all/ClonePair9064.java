package all;

public class ClonePair9064 {

    int method1(String a,String b){
      int i;
      char[] ca=a.toCharArray();
      char[] cb=b.toCharArray();
      int len=(ca.length < cb.length) ? ca.length : cb.length;
      for (i=0; i < len; i++)   if (ca[i] != cb[i])   break;
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
