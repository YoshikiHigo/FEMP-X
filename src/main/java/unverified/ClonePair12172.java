package unverified;

public class ClonePair12172 {

    int method1(String text,int startIndex,char c){
      int retVal=-1;
      int pos=startIndex;
      while (pos < text.length()) {
        if (text.charAt(pos) == c) {
          retVal=pos;
          break;
        }
        pos++;
      }
      return retVal;
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
