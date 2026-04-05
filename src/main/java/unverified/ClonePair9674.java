package unverified;

public class ClonePair9674 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }
}
