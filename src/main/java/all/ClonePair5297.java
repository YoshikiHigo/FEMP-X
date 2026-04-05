package all;

public class ClonePair5297 {

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

    int method2(char[] s,int start){
      int slen=s.length;
      for (int i=start; i < slen; i++) {
        if (!Character.isSpace(s[i]))     return i;
      }
      return slen;
    }
}
