package unverified;

public class ClonePair9921 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }
}
