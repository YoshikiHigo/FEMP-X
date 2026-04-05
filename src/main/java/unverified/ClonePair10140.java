package unverified;

public class ClonePair10140 {

    boolean method1(char c){
      boolean rval=false;
      if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
        rval=true;
      }
      return rval;
    }

    boolean method2(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
}
