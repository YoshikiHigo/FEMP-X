package unverified;

public class ClonePair13672 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
      int rtnVal=-1;
    switch (c) {
    case '0':    rtnVal=0;
      break;
    case '1':rtnVal=1;
    break;
    case '2':rtnVal=2;
    break;
    case '3':rtnVal=3;
    break;
    case '4':rtnVal=4;
    break;
    case '5':rtnVal=5;
    break;
    case '6':rtnVal=6;
    break;
    case '7':rtnVal=7;
    break;
    case '8':rtnVal=8;
    break;
    case '9':rtnVal=9;
    break;
    case 'a':case 'A':rtnVal=10;
    break;
    case 'b':case 'B':rtnVal=11;
    break;
    case 'c':case 'C':rtnVal=12;
    break;
    case 'd':case 'D':rtnVal=13;
    break;
    case 'e':case 'E':rtnVal=14;
    break;
    case 'f':case 'F':rtnVal=15;
    }
    return rtnVal;
    }
}
