package all;

public class ClonePair8033 {

    String method1(int number){
      String roman="";
      do {
        if (number >= 1000) {
          number-=1000;
          roman+="M";
        }
     else     if (number >= 900) {
          number-=900;
          roman+="CM";
        }
     else     if (number >= 500) {
          number-=500;
          roman+="D";
        }
     else     if (number >= 400) {
          number-=400;
          roman+="CD";
        }
     else     if (number >= 100) {
          number-=100;
          roman+="C";
        }
     else     if (number >= 90) {
          number-=90;
          roman+="XC";
        }
     else     if (number >= 50) {
          number-=50;
          roman+="L";
        }
     else     if (number >= 40) {
          number-=40;
          roman+="XL";
        }
     else     if (number >= 10) {
          number-=10;
          roman+="X";
        }
     else     if (number >= 9) {
          number-=9;
          roman+="IX";
        }
     else     if (number >= 5) {
          number-=5;
          roman+="V";
        }
     else     if (number >= 4) {
          number-=4;
          roman+="IV";
        }
     else     if (number >= 1) {
          number-=1;
          roman+="I";
        }
      }
     while (number > 0);
      return roman;
    }

    String method2(int n){
      String r="";
    switch (n / 1000) {
    case 1:    r+="M";
      break;
    case 2:r+="MM";
    break;
    case 3:r+="MMM";
    break;
    }
    n=n % 1000;
    switch (n / 100) {
    case 1:r+="C";
    break;
    case 2:r+="CC";
    break;
    case 3:r+="CCC";
    break;
    case 4:r+="CD";
    break;
    case 5:r+="D";
    break;
    case 6:r+="DC";
    break;
    case 7:r+="DCC";
    break;
    case 8:r+="DCCC";
    break;
    case 9:r+="CM";
    break;
    }
    n=n % 100;
    switch (n / 10) {
    case 1:r+="X";
    break;
    case 2:r+="XX";
    break;
    case 3:r+="XXX";
    break;
    case 4:r+="XL";
    break;
    case 5:r+="L";
    break;
    case 6:r+="LX";
    break;
    case 7:r+="LXX";
    break;
    case 8:r+="LXXX";
    break;
    case 9:r+="XC";
    break;
    }
    n=n % 10;
    switch (n) {
    case 1:r+="I";
    break;
    case 2:r+="II";
    break;
    case 3:r+="III";
    break;
    case 4:r+="IV";
    break;
    case 5:r+="V";
    break;
    case 6:r+="VI";
    break;
    case 7:r+="VII";
    break;
    case 8:r+="VIII";
    break;
    case 9:r+="IX";
    break;
    }
    return r;
    }
}
