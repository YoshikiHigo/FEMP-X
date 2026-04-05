package all;

public class ClonePair12180 {

    int method1(String str,int start,char toFind){
      boolean escaped=false;
      for (int i=start; i < str.length(); i++) {
        char c=str.charAt(i);
        if (c == '\\') {
          escaped=true;
        }
     else {
          if (!escaped && c == toFind)       return i;
          escaped=false;
        }
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
