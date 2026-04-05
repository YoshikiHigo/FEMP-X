package all;

public class ClonePair9990 {

    int method1(String text,String pattern){
      int tLen=text.length(), pLen=pattern.length();
      if (pLen > tLen)   return -1;
      if (pLen == 0)   return 0;
      int[] next=new int[pLen + 1];
      int i=1, j=0;
      while (i < pLen) {
        if (pattern.charAt(i) == pattern.charAt(j)) {
          i++;
          j++;
          next[i]=j;
        }
     else     if (j == 0) {
          i++;
          next[i]=j;
        }
     else     j=next[j];
      }
      i=j=0;
      while (i < tLen && j < pLen) {
        if (text.charAt(i) == pattern.charAt(j)) {
          i++;
          j++;
        }
     else     if (j == 0)     i++;
     else     j=next[j];
      }
      if (j == pLen)   return i - j;
      return -1;
    }

    int method2(String dans,String cherche){
      int lastTrouve=-1;
      int trouve=-1;
      while ((trouve=dans.indexOf(cherche,trouve + 1)) != -1) {
        lastTrouve=trouve;
      }
      return lastTrouve;
    }
}
