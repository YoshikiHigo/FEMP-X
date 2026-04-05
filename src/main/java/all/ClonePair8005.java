package all;

public class ClonePair8005 {

    int[] method1(byte[] arrayToConvert){
      int[] intArray;
      if (arrayToConvert.length % 4 == 0)   intArray=new int[arrayToConvert.length / 4];
     else   intArray=new int[(arrayToConvert.length / 4) + 1];
      byte[] currentIntByteArray=new byte[4];
      int currentInt=0;
      int shiftDistance;
      for (int i=0; i < intArray.length; i++) {
        for (int j=0; j < currentIntByteArray.length; j++) {
          if (((i * 4) + j) < arrayToConvert.length)       currentIntByteArray[j]=arrayToConvert[(i * 4) + j];
     else       currentIntByteArray[j]=0;
        }
        currentInt=0;
        for (int j=0; j < currentIntByteArray.length; j++) {
          shiftDistance=(4 - 1 - j) * 8;
          currentInt+=(currentIntByteArray[j] & 0x000000FF) << shiftDistance;
        }
        intArray[i]=currentInt;
      }
      return intArray;
    }

    int[] method2(byte[] byteArray){
      int j=0;
      byte[] newBA;
      int mod=byteArray.length % 4;
    switch (mod) {
    case 3:    newBA=new byte[byteArray.length + 1];
      break;
    case 2:newBA=new byte[byteArray.length + 2];
    break;
    case 1:newBA=new byte[byteArray.length + 3];
    break;
    default:newBA=new byte[byteArray.length + 0];
    break;
    }
    System.arraycopy(byteArray,0,newBA,0,byteArray.length);
    int[] newSeed=new int[newBA.length / 4];
    for (int i=0; i < newBA.length; i+=4) {
    newSeed[j]=newBA[i + 3] & 0xFF;
    newSeed[j]|=(newBA[i + 2] << 8) & 0xFF00;
    newSeed[j]|=(newBA[i + 1] << 16) & 0xFF0000;
    newSeed[j]|=(newBA[i + 0] << 24) & 0xFF000000;
    j++;
    }
    return newSeed;
    }
}
