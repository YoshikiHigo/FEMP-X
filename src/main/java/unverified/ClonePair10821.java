package unverified;

public class ClonePair10821 {

    int method1(int v){
      if (v >= '0' && v <= '9')   return v - '0';
      if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
      if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
      return -1;
    }

    int method2(int c){
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
}
