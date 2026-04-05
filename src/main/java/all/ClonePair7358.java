package all;

public class ClonePair7358 {

    Integer method1(byte[] bytes){
      if (bytes == null)   return null;
      int a=((bytes[3] & 0xFF) << 0) | ((bytes[2] & 0xFF) << 8) | ((bytes[1] & 0xFF) << 16)| ((bytes[0] & 0xFF) << 24);
      Integer aa=new Integer(a);
      return aa;
    }

    Integer method2(byte[] bytes){
      if (bytes == null)   return null;
      int a=0;
      for (int i=0, j=24; i < 4; i++, j-=8)   a+=((int)bytes[i] & 0xFF) << j;
      Integer aa=new Integer(a);
      return aa;
    }
}
