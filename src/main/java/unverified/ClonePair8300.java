package unverified;

public class ClonePair8300 {

    int method1(int ch){
    switch (ch) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':    return ch - '0';
    case 'a':case 'A':  return 10;
    case 'b':case 'B':return 11;
    case 'c':case 'C':return 12;
    case 'd':case 'D':return 13;
    case 'e':case 'E':return 14;
    case 'f':case 'F':return 15;
    default:return -1;
    }
    }

    int method2(int c){
      if (c >= '0' && c <= '9')   return (c - '0');
     else   if (c >= 'A' && c <= 'F')   return (c - 'A' + 10);
     else   if (c >= 'a' && c <= 'f')   return (c - 'a' + 10);
     else   return -1;
    }
}
