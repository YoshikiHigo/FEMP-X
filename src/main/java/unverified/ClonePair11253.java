package unverified;

public class ClonePair11253 {

    int method1(String s,String t){
      int slen_=s.length();
      int tlen_=t.length();
      int len_=Math.min(slen_,tlen_);
      for (int i=0; i < len_; i++) {
        char a=s.charAt(i), b=t.charAt(i);
        if (a > b)     return 1;
     else     if (a < b)     return -1;
      }
      if (slen_ > tlen_)   return 1;
     else   if (slen_ < tlen_)   return -1;
     else   return 0;
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
