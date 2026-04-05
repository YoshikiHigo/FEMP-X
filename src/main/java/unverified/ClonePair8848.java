package unverified;

public class ClonePair8848 {

    int method1(int octet){
      if (octet >= 'A' && octet <= 'Z') {
        octet=octet - 'A';
      }
     else   if (octet >= 'a' && octet <= 'z') {
        octet=(octet - 'a') + 26;
      }
     else   if (octet >= '0' && octet <= '9') {
        octet=(octet - '0') + 52;
      }
     else   if (octet == '+') {
        octet=62;
      }
     else   if (octet == '/') {
        octet=63;
      }
     else   if (octet == '=') {
        octet=65;
      }
     else {
        octet=-1;
      }
      return octet;
    }

    int method2(int i){
      if (i >= 65 && i <= 90)   return i - 65;
      if (i >= 97 && i <= 122)   return (i - 97) + 26;
      if (i >= 48 && i <= 57)   return (i - 48) + 52;
    switch (i) {
    case 61:    return 65;
    case 43:  return 62;
    case 47:return 63;
    }
    return -1;
    }
}
