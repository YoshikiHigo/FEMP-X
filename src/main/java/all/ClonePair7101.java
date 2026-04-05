package all;

public class ClonePair7101 {

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

    String method2(byte aByte){
      String out="";
      for (int i=0; i < 2; i++) {
        int temp=(int)aByte;
        if (temp < 0) {
          temp+=256;
        }
        if (i == 0) {
          temp=temp / 16;
        }
     else {
          temp=temp % 16;
        }
        if (temp > 9) {
    switch (temp) {
    case 10:        out+="A";
          break;
    case 11:    out+="B";
      break;
    case 12:out+="C";
    break;
    case 13:out+="D";
    break;
    case 14:out+="E";
    break;
    case 15:out+="F";
    break;
    }
    }
     else {
    out+=Integer.toString(temp);
    }
    }
    return out;
    }
}
