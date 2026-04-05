package all;

public class ClonePair10742 {

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
