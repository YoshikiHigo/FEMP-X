package all;

public class ClonePair7110 {

    int method1(int srcX,int srcY,int destX,int destY){
      int dx=destX - srcX;
      int dy=destY - srcY;
      if (dx < 0) {
        if (dy < 0) {
          if (dx < dy)       return 11;
     else       if (dx > dy)       return 9;
     else       return 10;
        }
     else     if (dy > 0) {
          if (-dx < dy)       return 15;
     else       if (-dx > dy)       return 13;
     else       return 14;
        }
     else {
          return 12;
        }
      }
     else   if (dx > 0) {
        if (dy < 0) {
          if (dx < -dy)       return 7;
     else       if (dx > -dy)       return 5;
     else       return 6;
        }
     else     if (dy > 0) {
          if (dx < dy)       return 1;
     else       if (dx > dy)       return 3;
     else       return 2;
        }
     else {
          return 4;
        }
      }
     else {
        if (dy < 0) {
          return 8;
        }
     else     if (dy > 0) {
          return 0;
        }
     else {
          return -1;
        }
      }
    }

    int method2(int srcX,int srcY,int destX,int destY){
      int dx=destX - srcX, dy=destY - srcY;
      if (dx < 0) {
        if (dy < 0) {
          if (dx < dy)       return 11;
     else       if (dx > dy)       return 9;
     else       return 10;
        }
     else     if (dy > 0) {
          if (-dx < dy)       return 15;
     else       if (-dx > dy)       return 13;
     else       return 14;
        }
     else {
          return 12;
        }
      }
     else   if (dx > 0) {
        if (dy < 0) {
          if (dx < -dy)       return 7;
     else       if (dx > -dy)       return 5;
     else       return 6;
        }
     else     if (dy > 0) {
          if (dx < dy)       return 1;
     else       if (dx > dy)       return 3;
     else       return 2;
        }
     else {
          return 4;
        }
      }
     else {
        if (dy < 0) {
          return 8;
        }
     else     if (dy > 0) {
          return 0;
        }
     else {
          return -1;
        }
      }
    }
}
