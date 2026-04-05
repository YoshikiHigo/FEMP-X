package unverified;

public class ClonePair5303 {

    int method1(char[] s,int start){
      int slen=s.length;
      for (int i=start; i < slen; i++) {
        if (!Character.isSpace(s[i]))     return i;
      }
      return slen;
    }

    int method2(char[] expression,int p){
      for (int i=p; i < expression.length; i++) {
    switch (expression[i]) {
    case ' ':case '\t':case '\n':case '\r':      continue;
    default:    return i;
    }
    }
    return expression.length;
    }
}
