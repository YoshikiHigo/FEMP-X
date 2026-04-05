package all;

public class ClonePair7097 {

    String method1(byte p_byte){
      StringBuffer strBuf=new StringBuffer();
      for (int i=0; i < 2; i++) {
        byte halfbyte=0;
        if (i == 0)     halfbyte=(byte)(p_byte >> 4 & 0xf);
     else     halfbyte=(byte)(p_byte & 0xf);
    switch (halfbyte) {
    case 0:      strBuf.append('0');
        break;
    case 1:  strBuf.append('1');
    break;
    case 2:strBuf.append('2');
    break;
    case 3:strBuf.append('3');
    break;
    case 4:strBuf.append('4');
    break;
    case 5:strBuf.append('5');
    break;
    case 6:strBuf.append('6');
    break;
    case 7:strBuf.append('7');
    break;
    case 8:strBuf.append('8');
    break;
    case 9:strBuf.append('9');
    break;
    case 10:strBuf.append('A');
    break;
    case 11:strBuf.append('B');
    break;
    case 12:strBuf.append('C');
    break;
    case 13:strBuf.append('D');
    break;
    case 14:strBuf.append('E');
    break;
    case 15:strBuf.append('F');
    break;
    default:return null;
    }
    }
    return strBuf.toString();
    }

    String method2(byte b){
      int i=b & 0xFF;
      byte j=(byte)(i / 0x10);
      String s;
      if (j == 0x0) {
        s="0";
      }
     else   if (j == 0x1) {
        s="1";
      }
     else   if (j == 0x2) {
        s="2";
      }
     else   if (j == 0x3) {
        s="3";
      }
     else   if (j == 0x4) {
        s="4";
      }
     else   if (j == 0x5) {
        s="5";
      }
     else   if (j == 0x6) {
        s="6";
      }
     else   if (j == 0x7) {
        s="7";
      }
     else   if (j == 0x8) {
        s="8";
      }
     else   if (j == 0x9) {
        s="9";
      }
     else   if (j == 0xA) {
        s="A";
      }
     else   if (j == 0xB) {
        s="B";
      }
     else   if (j == 0xC) {
        s="C";
      }
     else   if (j == 0xD) {
        s="D";
      }
     else   if (j == 0xE) {
        s="E";
      }
     else {
        s="F";
      }
      j=(byte)(i % 0x10);
      String t;
      if (j == 0x0) {
        t="0";
      }
     else   if (j == 0x1) {
        t="1";
      }
     else   if (j == 0x2) {
        t="2";
      }
     else   if (j == 0x3) {
        t="3";
      }
     else   if (j == 0x4) {
        t="4";
      }
     else   if (j == 0x5) {
        t="5";
      }
     else   if (j == 0x6) {
        t="6";
      }
     else   if (j == 0x7) {
        t="7";
      }
     else   if (j == 0x8) {
        t="8";
      }
     else   if (j == 0x9) {
        t="9";
      }
     else   if (j == 0xA) {
        t="A";
      }
     else   if (j == 0xB) {
        t="B";
      }
     else   if (j == 0xC) {
        t="C";
      }
     else   if (j == 0xD) {
        t="D";
      }
     else   if (j == 0xE) {
        t="E";
      }
     else {
        t="F";
      }
      return s + t;
    }
}
