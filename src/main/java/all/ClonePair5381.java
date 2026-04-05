package all;

public class ClonePair5381 {

    int method1(byte[] key,byte[] pattern,boolean exact){
      int klen=key.length;
      int plen=pattern.length;
      int kc0, kc1, pc0, pc1;
      for (int i=0; i < klen; i+=2) {
        if (i >= plen) {
          return key[i] & 0xff;
        }
        if (key[i] == '\0') {
          if (exact) {
            return -(pattern[i] & 0xff);
          }
     else {
            return 0;
          }
        }
        if (i + 1 >= klen || i + 1 >= plen) {
          return (key[i] & 0xff) - (pattern[i] & 0xff);
        }
        kc0=key[i] & 0xff;
        kc1=key[i + 1] & 0xff;
        pc0=pattern[i] & 0xff;
        pc1=pattern[i + 1] & 0xff;
        if ((kc0 == 0x24 || kc0 == 0x25) && (pc0 == 0x24 || pc0 == 0x25)) {
          if (kc1 != pc1) {
            return ((kc0 << 8) + kc1) - ((pc0 << 8) + pc1);
          }
        }
     else {
          if (kc0 != pc0 || kc1 != pc1) {
            return ((kc0 << 8) + kc1) - ((pc0 << 8) + pc1);
          }
        }
      }
      if (klen < plen && exact) {
        return -(pattern[klen] & 0xff);
      }
      return 0;
    }

    int method2(byte[] key,byte[] pattern,boolean exact){
      int klen=key.length;
      int plen=pattern.length;
      int kc0, kc1, pc0, pc1;
      for (int i=0; i < klen; i+=2) {
        if (i >= plen) {
          return key[i] & 0xff;
        }
        if (key[i] == '\0') {
          if (exact) {
            return -(pattern[i] & 0xff);
          }
     else {
            return 0;
          }
        }
        if (i + 1 >= klen || i + 1 >= plen) {
          return (key[i] & 0xff) - (pattern[i] & 0xff);
        }
        kc0=key[i] & 0xff;
        kc1=key[i + 1] & 0xff;
        pc0=pattern[i] & 0xff;
        pc1=pattern[i + 1] & 0xff;
        if ((kc0 == 0x24 || kc0 == 0x25) && (pc0 == 0x24 || pc0 == 0x25)) {
          if (kc1 != pc1) {
            return kc1 - pc1;
          }
        }
     else {
          if (kc0 != pc0 || kc1 != pc1) {
            return ((kc0 << 8) + kc1) - ((pc0 << 8) + pc1);
          }
        }
      }
      if (klen < plen && exact) {
        return -(pattern[klen] & 0xff);
      }
      return 0;
    }
}
