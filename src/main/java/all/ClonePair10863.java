package all;

public class ClonePair10863 {

    boolean method1(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }

    boolean method2(char c){
      if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
     else   return false;
    }
}
