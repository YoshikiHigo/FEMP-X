package unverified;

public class ClonePair13641 {

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
    }
    c=Character.toLowerCase(c);
    switch (c) {
    case 'a':return 10;
    case 'b':return 11;
    case 'c':return 12;
    case 'd':return 13;
    case 'e':return 14;
    case 'f':return 15;
    }
    return 0;
    }

    int method2(char code){
      if (code == 'A' || code == 'a') {
        return 10;
      }
     else   if (code == 'B' || code == 'b') {
        return 11;
      }
     else   if (code == 'C' || code == 'c') {
        return 12;
      }
     else   if (code == 'D' || code == 'd') {
        return 13;
      }
     else   if (code == 'E' || code == 'e') {
        return 14;
      }
     else   if (code == 'F' || code == 'f') {
        return 15;
      }
     else {
        try {
          return Integer.parseInt(String.valueOf(code));
        }
     catch (    NumberFormatException e) {
          return 0;
        }
      }
    }
}
