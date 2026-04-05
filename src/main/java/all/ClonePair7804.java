package all;

public class ClonePair7804 {

    int method1(int ch){
      if (ch < '0')   return -1;
      if (ch > 'f')   return -1;
      if (ch <= '9')   return ch - '0';
      if (ch < 'A')   return -1;
      if (ch <= 'F')   return ch - 'A' + 10;
      if (ch < 'a')   return -1;
      return ch - 'a' + 10;
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
