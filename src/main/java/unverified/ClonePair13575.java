package unverified;

public class ClonePair13575 {

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

    int method2(char a){
      if ((a >= '0') && (a <= '9'))   return ((int)a) - ((int)('0'));
     else   if ((a >= 'A') && (a <= 'F'))   return ((int)a) - ((int)('A')) + 10;
     else   if ((a >= 'a') && (a <= 'f'))   return ((int)a) - ((int)('a')) + 10;
     else   return -1;
    }
}
