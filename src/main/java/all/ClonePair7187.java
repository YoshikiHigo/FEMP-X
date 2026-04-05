package all;

public class ClonePair7187 {

    int method1(byte[] text,int textOffset,int textLength,byte[] data,int dataOffset,int dataLength){
      int k, j, prn, tv, c;
      if (textLength == 0)   return 0;
      if (textLength < 250 && textLength + 2 > dataLength)   return -1;
      if (textLength >= 250 && textLength + 3 > dataLength)   return -1;
      data[dataOffset]=(byte)231;
      if (textLength < 250) {
        data[dataOffset + 1]=(byte)textLength;
        k=2;
      }
     else {
        data[dataOffset + 1]=(byte)(textLength / 250 + 249);
        data[dataOffset + 2]=(byte)(textLength % 250);
        k=3;
      }
      System.arraycopy(text,textOffset,data,k + dataOffset,textLength);
      k+=textLength + dataOffset;
      for (j=dataOffset + 1; j < k; ++j) {
        c=data[j] & 0xff;
        prn=149 * (j + 1) % 255 + 1;
        tv=c + prn;
        if (tv > 255)     tv-=256;
        data[j]=(byte)tv;
      }
      return k - dataOffset;
    }

    int method2(byte[] text,int textOffset,int textLength,byte[] data,int dataOffset,int dataLength){
      int k, j, prn, tv, c;
      if (textLength == 0)   return 0;
      if (textLength < 250 && textLength + 2 > dataLength)   return -1;
      if (textLength >= 250 && textLength + 3 > dataLength)   return -1;
      data[dataOffset]=(byte)231;
      if (textLength < 250) {
        data[dataOffset + 1]=(byte)textLength;
        k=2;
      }
     else {
        data[dataOffset + 1]=(byte)(textLength / 250 + 249);
        data[dataOffset + 2]=(byte)(textLength % 250);
        k=3;
      }
      System.arraycopy(text,textOffset,data,k + dataOffset,textLength);
      k+=textLength + dataOffset;
      for (j=dataOffset + 1; j < k; ++j) {
        c=data[j] & 0xff;
        prn=((149 * (j + 1)) % 255) + 1;
        tv=c + prn;
        if (tv > 255)     tv-=256;
        data[j]=(byte)tv;
      }
      return k - dataOffset;
    }
}
