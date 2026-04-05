package unverified;

public class ClonePair13601 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
      if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
      if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      return 0;
    }

    int method2(char a){
      if (a <= '9' && a >= '0')   return a - '0';
     else   if (a <= 'F' && a >= 'A')   return a - 'A' + 10;
     else   if (a <= 'f' && a >= 'a')   return a - 'a' + 10;
     else   return 0;
    }
}
