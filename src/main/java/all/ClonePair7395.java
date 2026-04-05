package all;

public class ClonePair7395 {

    int method1(byte[] data,int offset){
      int tempByte=data[offset];
      if (tempByte < 0)   return tempByte + 256;
     else   return tempByte;
    }

    int method2(byte[] data,int offset){
      int rc=(int)data[offset];
      if (rc < 0)   return rc + 256;
     else   return rc;
    }
}
