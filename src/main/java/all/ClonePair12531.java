package all;

public class ClonePair12531 {

    int method1(String c,char l,int p){
      for (int n=p; n < c.length(); n++) {
        if (c.charAt(n) == l)     return n;
      }
      return -1;
    }

    int method2(String s,char a_separator,int a_fromIndex){
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
}
