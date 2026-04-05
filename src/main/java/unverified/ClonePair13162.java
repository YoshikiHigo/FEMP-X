package unverified;

public class ClonePair13162 {

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

    byte[] method2(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
    }
}
