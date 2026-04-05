package unverified;

public class ClonePair6756 {

    byte[] method1(byte[] data){
      byte groomedData[]=new byte[data.length];
      int bytesCopied=0;
      for (  byte aByte : data) {
    switch (aByte) {
    case (byte)' ':case (byte)'\n':case (byte)'\r':case (byte)'\t':      break;
    default:    groomedData[bytesCopied++]=aByte;
    }
    }
    byte packedData[]=new byte[bytesCopied];
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
