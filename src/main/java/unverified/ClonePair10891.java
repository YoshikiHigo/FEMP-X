package unverified;

public class ClonePair10891 {

    boolean method1(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }

    boolean method2(char ch){
      if (ch > 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
    }
}
