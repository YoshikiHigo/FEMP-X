package all;

public class ClonePair9989 {

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

    int method2(String base,String str){
      int result=0, temp=0;
      result=temp=base.indexOf(str);
      while (temp != -1) {
        result=temp;
        temp=base.indexOf(str,result + 1);
      }
      return result;
    }
}
