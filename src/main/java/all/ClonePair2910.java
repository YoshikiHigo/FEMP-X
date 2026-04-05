package all;

public class ClonePair2910 {

    boolean method1(byte[] address){
      if (address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == (byte)0xFF) && (address[11] == (byte)0xFF)) {
        return true;
      }
      return false;
    }

    boolean method2(byte[] data){
      if (data.length < 4) {
        return false;
      }
      return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff))&& (0x47 == (data[3] & 0xff));
    }
}
