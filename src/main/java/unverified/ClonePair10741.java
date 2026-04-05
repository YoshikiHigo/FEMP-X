package unverified;

public class ClonePair10741 {

    int method1(String lsz,String rsz){
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
