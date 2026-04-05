package all;

public class ClonePair10895 {

    boolean method1(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }

    boolean method2(char c){
      boolean result=false;
    switch (c) {
    case ' ':case '\t':case '\n':case '\r':    result=true;
      break;
    default:result=false;
    break;
    }
    return result;
    }
}
