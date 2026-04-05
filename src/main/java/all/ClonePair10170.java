package all;

public class ClonePair10170 {

    boolean method1(char c){
      boolean rval=false;
      if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
        rval=true;
      }
      return rval;
    }

    boolean method2(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }
}
