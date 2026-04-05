package all;

public class ClonePair3082 {

    boolean method1(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }

    boolean method2(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }
}
