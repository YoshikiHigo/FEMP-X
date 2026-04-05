package all;

public class ClonePair9109 {

    int method1(String o1,String o2){
      int lenComp=Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
      if (lenComp != 0) {
        return lenComp;
      }
      if (o1.equals(o2)) {
        return 0;
      }
      return o1.compareTo(o2) > 0 ? 1 : -1;
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
