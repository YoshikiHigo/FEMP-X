package all;

public class ClonePair8208 {

    int method1(String str,char toChar,int startindex,int endindex){
      for (int i=startindex; i < endindex; i++) {
        char c=str.charAt(i);
        if (c == '\\') {
          i++;
          continue;
        }
     else     if (c == toChar) {
          return i;
        }
      }
      return -1;
    }

    int method2(String s,char searchChar,int beginIndex,int endIndex){
      for (int i=beginIndex; i < endIndex; i++) {
        if (s.charAt(i) == searchChar) {
          return i;
        }
      }
      return -1;
    }
}
