package unverified;

public class ClonePair9919 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
      return false;
    }
}
