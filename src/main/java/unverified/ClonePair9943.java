package unverified;

public class ClonePair9943 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char c){
      if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
     else   return false;
    }
}
