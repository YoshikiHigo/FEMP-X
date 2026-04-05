package all;

import java.util.*;

public class ClonePair4928 {

    boolean method1(Vector<String> first,Vector<String> second){
      if (first.size() != second.size())   return false;
      int size=first.size();
      boolean[] check=new boolean[size];
      for (int i=0; i < size; i++)   check[i]=false;
      for (int i=0; i < size; i++) {
        for (int j=0; j < size; j++) {
          if (first.get(i).equals(second.get(j)))       check[i]=true;
        }
      }
      for (int i=0; i < size; i++)   if (!check[i])   return false;
      return true;
    }

    boolean method2(Vector<String> vLast,Vector<String> vNew){
      if (vLast.size() != vNew.size())   return false;
      for (int i=0; i < vLast.size(); ++i) {
        if (false == vLast.get(i).equals(vNew.get(i)))     return false;
      }
      return true;
    }
}
