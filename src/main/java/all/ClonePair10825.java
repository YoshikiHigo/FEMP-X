package all;

public class ClonePair10825 {

    int method1(int v){
      if (v >= '0' && v <= '9')   return v - '0';
      if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
      if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
      return -1;
    }

    int method2(int ch){
      if ('0' <= ch && ch <= '9')   return ch - '0';
      if ('a' <= ch && ch <= 'f')   return ch - ('a' - 10);
      if ('A' <= ch && ch <= 'F')   return ch - ('A' - 10);
      return -1;
    }
}
