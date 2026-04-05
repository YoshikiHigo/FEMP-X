package all;

public class ClonePair76 {

    int method1(char[] pArray,char pChar,int pStartPos){
      int len=pArray.length;
      for (int i=pStartPos; i < len; i++) {
        if (pArray[i] == pChar) {
          return (i);
        }
      }
      return -1;
    }

    int method2(char[] src,char des,int start){
      for (int i=start; i < src.length; i++) {
        if (src[i] == des)     return i;
      }
      return -1;
    }
}
