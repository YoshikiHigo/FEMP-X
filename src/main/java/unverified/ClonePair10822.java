package unverified;

public class ClonePair10822 {

    int method1(int v){
      if (v >= '0' && v <= '9')   return v - '0';
      if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
      if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
      return -1;
    }

    int method2(int chr){
    switch (chr) {
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
    case 'a':return 0xa;
    case 'A':return 0xa;
    case 'b':return 0xb;
    case 'B':return 0xb;
    case 'c':return 0xc;
    case 'C':return 0xc;
    case 'd':return 0xd;
    case 'D':return 0xd;
    case 'e':return 0xe;
    case 'E':return 0xe;
    case 'f':return 0xf;
    case 'F':return 0xf;
    default:return -1;
    }
    }
}
