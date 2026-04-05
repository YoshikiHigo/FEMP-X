package all;

public class ClonePair10893 {

    boolean method1(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }

    boolean method2(char c){
    switch (c) {
    case 0x20:case 0x09:case 0x0a:case 0x0d:    return true;
    default:  return false;
    }
    }
}
