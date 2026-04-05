package unverified;

public class ClonePair9675 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
}
