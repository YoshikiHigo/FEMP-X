package all;

public class ClonePair8339 {

    int method1(int n){
      if (n < 0)   return 32;
      if (n > 0x0000ffff) {
        if (n > 0x00ffffff) {
          if (n > 0x0fffffff) {
            if (n > 0x3fffffff) {
              return 31;
            }
     else {
              if (n > 0x1fffffff)           return 30;
     else           return 29;
            }
          }
     else {
            if (n > 0x03ffffff) {
              if (n > 0x07ffffff)           return 28;
     else           return 27;
            }
     else {
              if (n > 0x01ffffff)           return 26;
     else           return 25;
            }
          }
        }
     else {
          if (n > 0x000fffff) {
            if (n > 0x003fffff) {
              if (n > 0x007fffff)           return 24;
     else           return 23;
            }
     else {
              if (n > 0x001fffff)           return 22;
     else           return 21;
            }
          }
     else {
            if (n > 0x0003ffff) {
              if (n > 0x0007ffff)           return 20;
     else           return 19;
            }
     else {
              if (n > 0x0001ffff)           return 18;
     else           return 17;
            }
          }
        }
      }
     else {
        if (n > 0x000000ff) {
          if (n > 0x00000fff) {
            if (n > 0x00003fff) {
              if (n > 0x00007fff)           return 16;
     else           return 15;
            }
     else {
              if (n > 0x00001fff)           return 14;
     else           return 13;
            }
          }
     else {
            if (n > 0x000003ff) {
              if (n > 0x000007ff)           return 12;
     else           return 11;
            }
     else {
              if (n > 0x000001ff)           return 10;
     else           return 9;
            }
          }
        }
     else {
          if (n > 0x0000000f) {
            if (n > 0x0000003f) {
              if (n > 0x0000007f)           return 8;
     else           return 7;
            }
     else {
              if (n > 0x0000001f)           return 6;
     else           return 5;
            }
          }
     else {
            if (n > 0x00000003) {
              if (n > 0x00000007)           return 4;
     else           return 3;
            }
     else {
              if (n > 0x00000001)           return 2;
              return n;
            }
          }
        }
      }
    }

    int method2(int num){
      if (num < 0) {
        return 32;
      }
      if (num < 0x10000)   if (num < 0x100)   if (num < 0x10)   if (num < 0x4)   if (num < 0x2)   if (num == 0x0)   return 0;
     else   return 1;
     else   return 2;
     else   if (num < 0x8)   return 3;
     else   return 4;
     else   if (num < 0x40)   if (num < 0x20)   return 5;
     else   return 6;
     else   if (num < 0x80)   return 7;
     else   return 8;
     else   if (num < 0x1000)   if (num < 0x400)   if (num < 0x200)   return 9;
     else   return 10;
     else   if (num < 0x800)   return 11;
     else   return 12;
     else   if (num < 0x4000)   if (num < 0x2000)   return 13;
     else   return 14;
     else   if (num < 0x8000)   return 15;
     else   return 16;
     else   if (num < 0x1000000)   if (num < 0x100000)   if (num < 0x40000)   if (num < 0x20000)   return 17;
     else   return 18;
     else   if (num < 0x80000)   return 19;
     else   return 20;
     else   if (num < 0x400000)   if (num < 0x200000)   return 21;
     else   return 22;
     else   if (num < 0x800000)   return 23;
     else   return 24;
     else   if (num < 0x10000000)   if (num < 0x4000000)   if (num < 0x2000000)   return 25;
     else   return 26;
     else   if (num < 0x8000000)   return 27;
     else   return 28;
     else   if (num < 0x40000000)   if (num < 0x20000000)   return 29;
     else   return 30;
     else   return 31;
    }
}
