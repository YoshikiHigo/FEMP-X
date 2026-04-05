package unverified;

public class ClonePair8597 {

    int method1(String s,int i){
      int len=s.length();
      for (int j=i; j < len; j++)   if (Character.isSpaceChar(s.charAt(j)))   return (j);
      return (-1);
    }

    int method2(String data,int i){
      int bCount=0;
      while (i < data.length()) {
        if (data.charAt(i) == '{') {
          ++bCount;
        }
     else     if (data.charAt(i) == '}') {
          --bCount;
        }
     else     if (data.charAt(i) == '\\') {
          ++i;
        }
     else     if (bCount == 0 && Character.isWhitespace(data.charAt(i))) {
          return i;
        }
        ++i;
      }
      if (bCount > 0) {
        return -1;
      }
      return -1;
    }
}
