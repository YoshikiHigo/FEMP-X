package unverified;

public class ClonePair13166 {

    byte[] method1(String digester){
      byte ret[]=new byte[digester.length() / 2];
      int conta=0;
      String app;
      for (int i=0; i < digester.length(); ) {
        app=digester.substring(i,i + 2);
        int car=Integer.parseInt(app,16);
        if (car >= 128)     car-=256;
        ret[conta]=(byte)car;
        i+=2;
        conta++;
      }
      return ret;
    }

    byte[] method2(String hexString){
      byte[] bytes=new byte[hexString.length() / 2];
      for (int i=0; i < hexString.length(); i=i + 2) {
        String hex=hexString.substring(i,i + 2);
        int b=Integer.parseInt(hex,16);
        bytes[i / 2]=b > 128 ? (byte)(b - 256) : (byte)b;
      }
      return bytes;
    }
}
