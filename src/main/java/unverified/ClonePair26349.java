package unverified;

public class ClonePair26349 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char ch){
      if ('0' <= ch && ch <= '9')   return ch - 48;
      if ('A' <= ch && ch <= 'F')   return (ch - 65) + 10;
      if ('a' <= ch && ch <= 'f')   return (ch - 97) + 10;
     else   return -1;
    }
}
