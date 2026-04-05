package unverified;

public class ClonePair7803 {

    int method1(int ch){
      if (ch < '0')   return -1;
      if (ch > 'f')   return -1;
      if (ch <= '9')   return ch - '0';
      if (ch < 'A')   return -1;
      if (ch <= 'F')   return ch - 'A' + 10;
      if (ch < 'a')   return -1;
      return ch - 'a' + 10;
    }

    int method2(int v){
      if (v >= '0' && v <= '9')   return v - '0';
      if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
      if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
      return -1;
    }
}
