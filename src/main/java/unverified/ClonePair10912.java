package unverified;

public class ClonePair10912 {

    int method1(int c){
      if ('0' <= c && c <= '9') {
        return c - '0';
      }
      if ('a' <= c && c <= 'f') {
        return c - ('a' - 10);
      }
      if ('A' <= c && c <= 'F') {
        return c - ('A' - 10);
      }
      return -1;
    }

    int method2(int ch){
      if ('0' <= ch && ch <= '9')   return ch - '0';
      if ('a' <= ch && ch <= 'f')   return ch - ('a' - 10);
      if ('A' <= ch && ch <= 'F')   return ch - ('A' - 10);
      return -1;
    }
}
