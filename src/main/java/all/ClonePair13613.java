package all;

public class ClonePair13613 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
      if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
      if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      return 0;
    }

    int method2(char ch){
      if (ch >= '0' && ch <= '9')   return ch - '0';
      if (ch >= 'A' && ch <= 'F')   return ch - 'A' + 10;
      if (ch >= 'a' && ch <= 'f')   return ch - 'a' + 10;
      return (0);
    }
}
