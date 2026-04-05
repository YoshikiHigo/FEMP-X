package all;

public class ClonePair10139 {

    boolean method1(char c){
      boolean rval=false;
      if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
        rval=true;
      }
      return rval;
    }

    boolean method2(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }
}
