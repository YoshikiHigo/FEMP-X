package unverified;

public class ClonePair13188 {

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
      int length=hexString.length();
      byte[] data=new byte[length / 2];
      for (int i=0; i < length; i+=2) {
        data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
      }
      return data;
    }
}
