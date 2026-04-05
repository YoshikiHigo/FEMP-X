package all;

public class ClonePair9632 {

    int method1(int c){
      if (c >= '0' && c <= '9')   return (c - '0');
     else   if (c >= 'A' && c <= 'F')   return (c - 'A' + 10);
     else   if (c >= 'a' && c <= 'f')   return (c - 'a' + 10);
     else   return -1;
    }

    int method2(int ch){
      if ('0' <= ch && ch <= '9')   return ch - '0';
      if ('a' <= ch && ch <= 'f')   return ch - ('a' - 10);
      if ('A' <= ch && ch <= 'F')   return ch - ('A' - 10);
      return -1;
    }
}
