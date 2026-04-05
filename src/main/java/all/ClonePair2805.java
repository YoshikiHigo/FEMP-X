package all;

public class ClonePair2805 {

    boolean method1(byte[] imageData){
      if (imageData.length < 5) {
        return false;
      }
      return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D')&& (imageData[3] == 'F')&& (imageData[4] == '-'));
    }

    boolean method2(byte[] data){
      if (data.length < 4) {
        return false;
      }
      return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff))&& (0x47 == (data[3] & 0xff));
    }
}
