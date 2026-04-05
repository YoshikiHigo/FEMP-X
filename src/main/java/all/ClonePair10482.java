package all;

public class ClonePair10482 {

    int method1(String v1,String v2){
      for (int i=0; i < v1.length() && i < v2.length(); i++) {
        if (v1.charAt(i) < v2.charAt(i))     return -1;
        if (v1.charAt(i) > v2.charAt(i))     return 1;
      }
      if (v1.length() < v2.length())   return -1;
      if (v1.length() > v2.length())   return 1;
      return 0;
    }

    int method2(String string1,String string2){
      final int n=Math.min(string1.length(),string2.length());
      for (int i=0; i < n; i++) {
        final char ch1=Character.toLowerCase(string1.charAt(i));
        final char ch2=Character.toLowerCase(string2.charAt(i));
        if (ch1 < ch2)     return (-1);
     else     if (ch1 > ch2)     return (+1);
      }
      if (string1.length() < string2.length())   return (-1);
      if (string1.length() > string2.length())   return (+1);
      return (0);
    }
}
