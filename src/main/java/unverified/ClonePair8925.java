package unverified;

public class ClonePair8925 {

    boolean method1(char c){
      boolean result=false;
    switch (c) {
    case ' ':case '\t':case '\r':case '\b':case '\n':case '\f':    result=true;
    }
    return result;
    }

    boolean method2(char c){
      if ('\b' == c || '\t' == c || '\n' == c || '\f' == c || '\r' == c || ' ' == c) {
        return true;
      }
      return false;
    }
}
