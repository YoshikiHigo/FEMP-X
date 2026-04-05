package all;

public class ClonePair13671 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return ch - '0';
    case 'a':case 'b':case 'c':case 'd':case 'e':case 'f':  return ch - 'a' + 10;
    case 'A':case 'B':case 'C':case 'D':case 'E':case 'F':return ch - 'A' + 10;
    default:return -1;
    }
    }
}
