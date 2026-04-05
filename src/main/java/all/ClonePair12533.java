package all;

public class ClonePair12533 {

    int method1(String s,char a_separator,int a_fromIndex){
      if (a_fromIndex >= s.length()) {
        return -1;
      }
      char c=s.charAt(a_fromIndex);
      if (c == '"') {
        return s.indexOf('"',a_fromIndex + 1);
      }
     else {
        return s.indexOf(a_separator,a_fromIndex);
      }
    }

    int method2(String string,char c,int start){
      int i=start;
      while (i < string.length()) {
        if (string.charAt(i) == c) {
          return i;
        }
     else {
          i++;
        }
      }
      return -1;
    }
}
