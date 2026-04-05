package all;

public class ClonePair5299 {

    int method1(char[] src,int ofs){
      int cc=ofs, count=src.length;
      for (; cc < count; cc++) {
    switch (src[cc]) {
    case ' ':case '\t':case '\r':case '\n':      break;
    default:    return cc;
    }
    }
    return count;
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
