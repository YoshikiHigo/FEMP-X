package unverified;

public class ClonePair8639 {

    int method1(char[] source,int index,char match){
      for (int i=index; i < source.length; i++) {
        if (source[i] == match) {
          return i;
        }
      }
      return -1;
    }

    int method2(char[] data,int start,char c){
      for (int i=start; i < data.length; i++) {
        if (data[i] == c)     return i;
      }
      return (-1);
    }
}
