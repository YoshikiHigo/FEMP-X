package all;

public class ClonePair12176 {

    int method1(String text,int offset,char delimiter){
      for (int i=offset; i < text.length(); ++i) {
        char value=text.charAt(i);
        if (value == delimiter)     return i;
      }
      return -1;
    }

    int method2(String str,int sIndex,char match){
      int level, length, i;
      boolean quoted=false;
      char c;
      level=0;
      for (i=sIndex, length=str.length(); i < length; i++) {
        if (quoted) {
          quoted=false;
          continue;
        }
        c=str.charAt(i);
        if ((level == 0) && (c == match)) {
          return i;
        }
        if (c == '{') {
          level++;
        }
     else     if (c == '}') {
          level--;
        }
     else     if (c == '\\') {
          quoted=true;
        }
      }
      return -1;
    }
}
