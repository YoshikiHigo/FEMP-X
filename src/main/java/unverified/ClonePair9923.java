package unverified;

public class ClonePair9923 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
}
