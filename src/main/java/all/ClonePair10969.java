package all;

public class ClonePair10969 {

    byte method1(char c){
      byte b;
    switch (c) {
    case 'F':    b=(byte)0x0000000F;
      break;
    case 'E':b=(byte)0x0000000E;
    break;
    case 'D':b=(byte)0x0000000D;
    break;
    case 'C':b=(byte)0x0000000C;
    break;
    case 'B':b=(byte)0x0000000B;
    break;
    case 'A':b=(byte)0x0000000A;
    break;
    case '9':b=(byte)0x00000009;
    break;
    case '8':b=(byte)0x00000008;
    break;
    case '7':b=(byte)0x00000007;
    break;
    case '6':b=(byte)0x00000006;
    break;
    case '5':b=(byte)0x00000005;
    break;
    case '4':b=(byte)0x00000004;
    break;
    case '3':b=(byte)0x00000003;
    break;
    case '2':b=(byte)0x00000002;
    break;
    case '1':b=(byte)0x00000001;
    break;
    case '0':b=(byte)0x00000000;
    break;
    default:b=(byte)0x00000000;
    break;
    }
    return b;
    }

    byte method2(char hex8){
    switch (hex8) {
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
    case 'A':return 10;
    case 'B':return 11;
    case 'C':return 12;
    case 'D':return 13;
    case 'E':return 14;
    case 'F':return 15;
    default:return (byte)0;
    }
    }
}
