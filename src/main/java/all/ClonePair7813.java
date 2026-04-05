package all;

public class ClonePair7813 {

    int method1(int ch){
      if (ch < '0')   return -1;
      if (ch > 'f')   return -1;
      if (ch <= '9')   return ch - '0';
      if (ch < 'A')   return -1;
      if (ch <= 'F')   return ch - 'A' + 10;
      if (ch < 'a')   return -1;
      return ch - 'a' + 10;
    }

    int method2(int ch){
      if ('0' <= ch && ch <= '9')   return ch - '0';
      if ('a' <= ch && ch <= 'f')   return ch - ('a' - 10);
      if ('A' <= ch && ch <= 'F')   return ch - ('A' - 10);
      return -1;
    }
}
