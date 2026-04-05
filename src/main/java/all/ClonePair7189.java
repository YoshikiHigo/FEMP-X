package all;

public class ClonePair7189 {

    int method1(byte[] text,int textOffset,int textLength,byte[] data,int dataOffset,int dataLength){
      int ptrIn, ptrOut, edi, pedi, c;
      if (textLength == 0)   return 0;
      ptrIn=0;
      ptrOut=0;
      edi=0;
      pedi=18;
      boolean ascii=true;
      for (; ptrIn < textLength; ++ptrIn) {
        c=text[ptrIn + textOffset] & 0xff;
        if (((c & 0xe0) == 0x40 || (c & 0xe0) == 0x20) && c != '_') {
          if (ascii) {
            if (ptrOut + 1 > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)240;
            ascii=false;
          }
          c&=0x3f;
          edi|=c << pedi;
          if (pedi == 0) {
            if (ptrOut + 3 > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)(edi >> 16);
            data[dataOffset + ptrOut++]=(byte)(edi >> 8);
            data[dataOffset + ptrOut++]=(byte)edi;
            edi=0;
            pedi=18;
          }
     else       pedi-=6;
        }
     else {
          if (!ascii) {
            edi|=('_' & 0x3f) << pedi;
            if (ptrOut + 3 - pedi / 8 > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)(edi >> 16);
            if (pedi <= 12)         data[dataOffset + ptrOut++]=(byte)(edi >> 8);
            if (pedi <= 6)         data[dataOffset + ptrOut++]=(byte)edi;
            ascii=true;
            pedi=18;
            edi=0;
          }
          if (c > 127) {
            if (ptrOut >= dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)235;
            c-=128;
          }
          if (ptrOut >= dataLength)       break;
          data[dataOffset + ptrOut++]=(byte)(c + 1);
        }
      }
      if (ptrIn != textLength)   return -1;
      if (!ascii) {
        edi|=('_' & 0x3f) << pedi;
        if (ptrOut + 3 - pedi / 8 > dataLength)     return -1;
        data[dataOffset + ptrOut++]=(byte)(edi >> 16);
        if (pedi <= 12)     data[dataOffset + ptrOut++]=(byte)(edi >> 8);
        if (pedi <= 6)     data[dataOffset + ptrOut++]=(byte)edi;
      }
      return ptrOut;
    }

    int method2(byte[] text,int textOffset,int textLength,byte[] data,int dataOffset,int dataLength){
      int ptrIn, ptrOut, edi, pedi, c;
      if (textLength == 0)   return 0;
      ptrIn=0;
      ptrOut=0;
      edi=0;
      pedi=18;
      boolean ascii=true;
      for (; ptrIn < textLength; ++ptrIn) {
        c=text[ptrIn + textOffset] & 0xff;
        if (((c & 0xe0) == 0x40 || (c & 0xe0) == 0x20) && c != '_') {
          if (ascii) {
            if (ptrOut + 1 > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)240;
            ascii=false;
          }
          c&=0x3f;
          edi|=c << pedi;
          if (pedi == 0) {
            if (ptrOut + 3 > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)(edi >> 16);
            data[dataOffset + ptrOut++]=(byte)(edi >> 8);
            data[dataOffset + ptrOut++]=(byte)edi;
            edi=0;
            pedi=18;
          }
     else       pedi-=6;
        }
     else {
          if (!ascii) {
            edi|=('_' & 0x3f) << pedi;
            if (ptrOut + (3 - pedi / 8) > dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)(edi >> 16);
            if (pedi <= 12)         data[dataOffset + ptrOut++]=(byte)(edi >> 8);
            if (pedi <= 6)         data[dataOffset + ptrOut++]=(byte)edi;
            ascii=true;
            pedi=18;
            edi=0;
          }
          if (c > 127) {
            if (ptrOut >= dataLength)         break;
            data[dataOffset + ptrOut++]=(byte)235;
            c-=128;
          }
          if (ptrOut >= dataLength)       break;
          data[dataOffset + ptrOut++]=(byte)(c + 1);
        }
      }
      if (ptrIn != textLength)   return -1;
      if (!ascii) {
        edi|=('_' & 0x3f) << pedi;
        if (ptrOut + (3 - pedi / 8) > dataLength)     return -1;
        data[dataOffset + ptrOut++]=(byte)(edi >> 16);
        if (pedi <= 12)     data[dataOffset + ptrOut++]=(byte)(edi >> 8);
        if (pedi <= 6)     data[dataOffset + ptrOut++]=(byte)edi;
      }
      return ptrOut;
    }
}
