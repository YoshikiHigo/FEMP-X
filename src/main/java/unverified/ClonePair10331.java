package unverified;

public class ClonePair10331 {

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

    int method2(String lsz,String rsz){
      int lLen=lsz.length();
      int rLen=rsz.length();
      int len=0;
      if (lLen == 0 && rLen > 0)   return -1;
      if (rLen == 0 && lLen > 0)   return 1;
      if (lLen > rLen)   len=rLen;
     else   len=lLen;
      for (int i=0; i < len; i++)   if (lsz.charAt(i) > rsz.charAt(i))   return 1;
     else   if (lsz.charAt(i) < rsz.charAt(i))   return -1;
      return 0;
    }
}
