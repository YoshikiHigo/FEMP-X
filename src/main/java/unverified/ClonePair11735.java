package unverified;

public class ClonePair11735 {

    boolean method1(char c){
    switch (c) {
    case '\n':case '\r':case '\t':case ' ':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
      if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
     else   return false;
    }
}
