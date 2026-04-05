package unverified;

public class ClonePair2801 {

    boolean method1(byte[] imageData){
      if (imageData.length < 5) {
        return false;
      }
      return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D')&& (imageData[3] == 'F')&& (imageData[4] == '-'));
    }

    boolean method2(byte[] address){
      if (address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == (byte)0xFF) && (address[11] == (byte)0xFF)) {
        return true;
      }
      return false;
    }
}
