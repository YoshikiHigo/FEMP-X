package all;

public class ClonePair6782 {

    byte[] method1(byte[] data){
      byte[] groomedData=new byte[data.length];
      int bytesCopied=0;
      for (int i=0; i < data.length; ++i) {
    switch (data[i]) {
    case 9:case 10:case 13:case 32:      break;
    default:    groomedData[(bytesCopied++)]=data[i];
    }
    }
    byte[] packedData=new byte[bytesCopied];
    System.arraycopy(groomedData,0,packedData,0,bytesCopied);
    return packedData;
    }

    byte[] method2(byte[] data){
      byte groomedData[]=new byte[data.length];
      int bytesCopied=0;
      for (int i=0; i < data.length; i++) {
    switch (data[i]) {
    case ' ':case '\n':case '\r':case '\t':      break;
    default:    groomedData[bytesCopied++]=data[i];
    }
    }
    byte packedData[]=new byte[bytesCopied];
    System.arraycopy(groomedData,0,packedData,0,bytesCopied);
    return packedData;
    }
}
