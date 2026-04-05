package all;

public class ClonePair13600 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
      if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
      if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      return 0;
    }

    int method2(char c){
      if (c >= '0' && c <= '9') {
        return c - '0';
      }
     else   if (c >= 'a' && c <= 'f') {
        return (c - 'a') + 10;
      }
     else   if (c >= 'A' && c <= 'F') {
        return (c - 'A') + 10;
      }
      return 0;
    }
}
