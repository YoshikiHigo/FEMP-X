package unverified;

public class ClonePair10361 {

    int method1(String str1,String str2){
      int i1=0, i2=0;
      int len1=str1.length();
      int len2=str2.length();
      for (; ; ) {
        if (i1 == len1)     return i2 == len2 ? 0 : -1;
        if (i2 == len2)     return 1;
        int c1=str1.charAt(i1++);
        if (c1 >= 0xD800 && c1 < 0xDC00 && i1 < len1)     c1=(c1 - 0xD800) * 0x400 + (str1.charAt(i1++) - 0xDC00) + 0x10000;
        int c2=str2.charAt(i2++);
        if (c2 >= 0xD800 && c2 < 0xDC00 && i2 < len2)     c2=(c2 - 0xD800) * 0x400 + (str2.charAt(i2++) - 0xDC00) + 0x10000;
        if (c1 != c2)     return c1 < c2 ? -1 : 1;
      }
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
