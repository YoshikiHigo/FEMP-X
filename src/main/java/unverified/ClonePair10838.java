package unverified;

public class ClonePair10838 {

    boolean method1(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
      return false;
    }

    boolean method2(char c){
      if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
     else   return false;
    }
}
