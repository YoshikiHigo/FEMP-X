package unverified;

public class ClonePair10452 {

    int method1(String v1,String v2){
      for (int i=0; i < v1.length() && i < v2.length(); i++) {
        if (v1.charAt(i) < v2.charAt(i))     return -1;
        if (v1.charAt(i) > v2.charAt(i))     return 1;
      }
      if (v1.length() < v2.length())   return -1;
      if (v1.length() > v2.length())   return 1;
      return 0;
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
