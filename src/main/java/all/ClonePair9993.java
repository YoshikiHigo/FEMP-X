package all;

import java.util.*;

public class ClonePair9993 {

    int method1(BitSet bitset1,BitSet bitset2){
      if (bitset1.equals(bitset2))   return 0;
      if (bitset1.length() != bitset2.length())   return bitset1.length() - bitset2.length();
      for (int index=0; index < bitset1.length(); ++index)   if (bitset1.get(index) != bitset2.get(index))   return bitset1.get(index) ? 1 : -1;
      return 0;
    }

    int method2(BitSet bitset1,BitSet bitset2){
      if (bitset1.length() != bitset2.length())   return bitset1.length() - bitset2.length();
      if (bitset1.equals(bitset2))   return 0;
      for (int i=0; i < bitset1.length(); i++)   if (bitset1.get(i) != bitset2.get(i))   return bitset1.get(i) ? 1 : -1;
      return 0;
    }
}
