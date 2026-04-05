package all;

public class ClonePair7858 {

    int method1(char[] a,int fromIndex,int toIndex,char c){
      while (fromIndex < toIndex) {
        if (a[fromIndex] == c)     return fromIndex;
        ++fromIndex;
      }
      return -1;
    }

    int method2(char[] chars,int from,int to,char value){
      for (int i=from; i < to; i++) {
        if (chars[i] == value)     return i;
      }
      return -1;
    }
}
