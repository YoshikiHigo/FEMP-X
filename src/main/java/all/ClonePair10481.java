package all;

public class ClonePair10481 {

    int method1(String v1,String v2){
      for (int i=0; i < v1.length() && i < v2.length(); i++) {
        if (v1.charAt(i) < v2.charAt(i))     return -1;
        if (v1.charAt(i) > v2.charAt(i))     return 1;
      }
      if (v1.length() < v2.length())   return -1;
      if (v1.length() > v2.length())   return 1;
      return 0;
    }

    int method2(String s,String t){
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
}
