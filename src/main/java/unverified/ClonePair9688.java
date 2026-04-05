package unverified;

public class ClonePair9688 {

    boolean method1(char ch){
      if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
     else   return (false);
    }

    boolean method2(char c){
    switch (c) {
    case '\n':case '\r':case '\t':case ' ':    return true;
    default:  return false;
    }
    }
}
