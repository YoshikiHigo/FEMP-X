package all;

public class ClonePair8370 {

    int method1(int word){
      int i=0;
      while ((word & 0xF) == 0) {
        word>>=4;
        i+=4;
      }
      if ((word & 3) == 0) {
        word>>=2;
        i+=2;
      }
      if ((word & 1) == 0)   i+=1;
      return i;
    }

    int method2(int bits){
      if ((bits & 0xFFFF) != 0) {
        if ((bits & 0xFF) != 0) {
          if ((bits & 0xF) != 0) {
            if ((bits & 0x3) != 0) {
              if ((bits & 0x1) == 0x1)           return 0;
     else           return 1;
            }
     else {
              if ((bits & 0x4) == 0x4)           return 2;
     else           return 3;
            }
          }
     else {
            if ((bits & 0x30) != 0) {
              if ((bits & 0x10) == 0x10)           return 4;
     else           return 5;
            }
     else {
              if ((bits & 0x40) == 0x40)           return 6;
     else           return 7;
            }
          }
        }
     else {
          if ((bits & 0xF00) != 0) {
            if ((bits & 0x300) != 0) {
              if ((bits & 0x100) == 0x100)           return 8;
     else           return 9;
            }
     else {
              if ((bits & 0x400) == 0x400)           return 10;
     else           return 11;
            }
          }
     else {
            if ((bits & 0x3000) != 0) {
              if ((bits & 0x1000) == 0x1000)           return 12;
     else           return 13;
            }
     else {
              if ((bits & 0x4000) == 0x4000)           return 14;
     else           return 15;
            }
          }
        }
      }
     else {
        if ((bits & 0xFF0000) != 0) {
          if ((bits & 0xF0000) != 0) {
            if ((bits & 0x30000) != 0) {
              if ((bits & 0x10000) == 0x10000)           return 16;
     else           return 17;
            }
     else {
              if ((bits & 0x40000) == 0x40000)           return 18;
     else           return 19;
            }
          }
     else {
            if ((bits & 0x300000) != 0) {
              if ((bits & 0x100000) == 0x100000)           return 20;
     else           return 21;
            }
     else {
              if ((bits & 0x400000) == 0x400000)           return 22;
     else           return 23;
            }
          }
        }
     else {
          if ((bits & 0xF000000) != 0) {
            if ((bits & 0x3000000) != 0) {
              if ((bits & 0x1000000) == 0x1000000)           return 24;
     else           return 25;
            }
     else {
              if ((bits & 0x4000000) == 0x4000000)           return 26;
     else           return 27;
            }
          }
     else {
            if ((bits & 0x30000000) != 0) {
              if ((bits & 0x10000000) == 0x10000000)           return 28;
     else           return 29;
            }
     else {
              if ((bits & 0x40000000) == 0x40000000)           return 30;
     else           return 31;
            }
          }
        }
      }
    }
}
