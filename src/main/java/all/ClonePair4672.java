package all;

public class ClonePair4672 {

    boolean method1(int year){
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int year){
      final int modFour=year & 0x0003, modHundred=year % 100;
      if (((0 == modFour) && (modHundred != 0)) || ((0 == modHundred) && (0 == (modHundred & 0x0003))))   return true;
     else   return false;
    }
}
