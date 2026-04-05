package unverified;

public class ClonePair9916 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char c){
      boolean rval=false;
      if (c == ' ' || c == '\n' || c == '\t' || c == '\r') {
        rval=true;
      }
      return rval;
    }
}
