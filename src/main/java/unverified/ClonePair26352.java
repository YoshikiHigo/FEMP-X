package unverified;

public class ClonePair26352 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
    switch (c) {
    case '0':    return (char)0;
    case '1':  return (char)1;
    case '2':return (char)2;
    case '3':return (char)3;
    case '4':return (char)4;
    case '5':return (char)5;
    case '6':return (char)6;
    case '7':return (char)7;
    case '8':return (char)8;
    case '9':return (char)9;
    case 'a':case 'A':return (char)10;
    case 'b':case 'B':return (char)11;
    case 'c':case 'C':return (char)12;
    case 'd':case 'D':return (char)13;
    case 'e':case 'E':return (char)14;
    case 'f':case 'F':return (char)15;
    }
    return -1;
    }
}
