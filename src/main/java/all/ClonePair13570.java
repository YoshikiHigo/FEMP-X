package all;

public class ClonePair13570 {

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
