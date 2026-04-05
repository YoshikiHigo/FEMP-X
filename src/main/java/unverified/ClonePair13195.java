package unverified;

public class ClonePair13195 {

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

    byte[] method2(String hex){
      byte[] ret=new byte[hex.length() / 2];
      for (int i=0, len=hex.length(); i < len; i+=2) {
        int v=Integer.parseInt(hex.substring(i,i + 2),16);
        ret[i / 2]=(byte)v;
      }
      return ret;
    }
}
