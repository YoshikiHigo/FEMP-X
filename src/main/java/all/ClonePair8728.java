package all;

public class ClonePair8728 {

    boolean method1(byte[] aArray,int aIndexA,int aIndexB,int aCompCount){
      boolean zReturn=true;
      for (int i=0; i < aCompCount; i++) {
        if (aArray[aIndexA + i] != aArray[aIndexB + i]) {
          zReturn=false;
          break;
        }
      }
      return zReturn;
    }

    boolean method2(byte[] gcrData,int from,int to,int length){
      for (int i=0; i < length; i++) {
        if (gcrData[from + i] != gcrData[to + i]) {
          return false;
        }
      }
      return true;
    }
}
