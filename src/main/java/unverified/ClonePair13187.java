package unverified;

public class ClonePair13187 {

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

    byte[] method2(String s){
      byte[] bytes=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        bytes[i / 2]=(byte)(Integer.parseInt(s.substring(i,i + 2),16));
      }
      return bytes;
    }
}
