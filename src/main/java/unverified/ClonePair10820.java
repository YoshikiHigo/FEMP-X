package unverified;

public class ClonePair10820 {

    boolean method1(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
      return false;
    }

    boolean method2(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }
}
