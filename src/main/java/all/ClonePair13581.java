package all;

public class ClonePair13581 {

    int method1(char c){
    switch (c) {
    case '0':    return 0;
    case '1':  return 1;
    case '2':return 2;
    case '3':return 3;
    case '4':return 4;
    case '5':return 5;
    case '6':return 6;
    case '7':return 7;
    case '8':return 8;
    case '9':return 9;
    case 'a':case 'A':return 10;
    case 'b':case 'B':return 11;
    case 'c':case 'C':return 12;
    case 'd':case 'D':return 13;
    case 'e':case 'E':return 14;
    case 'f':case 'F':return 15;
    }
    return -1;
    }

    int method2(char c){
      if (c >= 'a') {
        if (c <= 'f') {
          return 10 + (c - 'a');
        }
      }
     else   if (c >= 'A') {
        if (c <= 'F') {
          return 10 + (c - 'A');
        }
      }
     else   if (c >= '0') {
        if (c <= '9') {
          return c - '0';
        }
      }
      return -1;
    }
}
