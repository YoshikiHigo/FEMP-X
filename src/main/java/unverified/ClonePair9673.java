package unverified;

public class ClonePair9673 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
      return false;
    }
}
