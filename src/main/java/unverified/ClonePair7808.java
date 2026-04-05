package unverified;

public class ClonePair7808 {

    int method1(int ch){
      if (ch < '0')   return -1;
      if (ch > 'f')   return -1;
      if (ch <= '9')   return ch - '0';
      if (ch < 'A')   return -1;
      if (ch <= 'F')   return ch - 'A' + 10;
      if (ch < 'a')   return -1;
      return ch - 'a' + 10;
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
