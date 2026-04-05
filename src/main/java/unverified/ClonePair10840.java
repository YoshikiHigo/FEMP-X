package unverified;

public class ClonePair10840 {

    boolean method1(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
