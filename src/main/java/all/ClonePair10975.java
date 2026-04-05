package all;

public class ClonePair10975 {

    byte method1(char sChar){
      if ((sChar >= 0x0000) && (sChar < 0x0080)) {
        return (byte)sChar;
      }
     else {
    switch (sChar) {
    case 'Ç':      return -0x80;
    case 'ü':    return -0x7F;
    case 'â':  return -0x7D;
    case 'ä':return -0x7C;
    case 'à':return -0x7B;
    case 'å':return -0x7A;
    case 'ç':return -0x79;
    case 'ê':return -0x78;
    case 'ë':return -0x77;
    case 'è':return -0x76;
    case 'ï':return -0x75;
    case 'î':return -0x74;
    case 'ì':return -0x73;
    case 'Ä':return -0x72;
    case 'Å':return -0x71;
    case 'É':return -0x70;
    case 'æ':return -0x6F;
    case 'Æ':return -0x6E;
    case 'ô':return -0x6D;
    case 'ö':return -0x6C;
    case 'ò':return -0x6B;
    case 'û':return -0x6A;
    case 'ù':return -0x69;
    case 'ÿ':return -0x68;
    case 'Ö':return -0x67;
    case 'Ü':return -0x66;
    case 'ø':return -0x65;
    case '£':return -0x64;
    case 'Ø':return -0x63;
    case '×':return -0x62;
    case 'á':return -0x60;
    case 'é':return -0x7E;
    case 'í':return -0x5F;
    case 'ó':return -0x5E;
    case 'ú':return -0x5D;
    case 'ñ':return -0x5C;
    case 'Ñ':return -0x5B;
    case 'ª':return -0x5A;
    case 'º':return -0x59;
    case '¿':return -0x58;
    case '®':return -0x57;
    case '¬':return -0x56;
    case '½':return -0x55;
    case '¼':return -0x54;
    case '¡':return -0x53;
    case '«':return -0x52;
    case '»':return -0x51;
    case '░':return -0x50;
    case '▒':return -0x4F;
    case '▓':return -0x4E;
    case '│':return -0x4D;
    case '┤':return -0x4C;
    case 'Á':return -0x4B;
    case 'Â':return -0x4A;
    case 'À':return -0x49;
    case '©':return -0x48;
    case '╣':return -0x47;
    case '║':return -0x46;
    case '╗':return -0x45;
    case '╝':return -0x44;
    case '¢':return -0x43;
    case '¥':return -0x42;
    case '┐':return -0x41;
    case '└':return -0x40;
    case 'Ê':return -0x2E;
    case 'Ë':return -0x2D;
    case 'È':return -0x2C;
    case '€':return (byte)0xD5;
    case 'Í':return -0x2A;
    case 'Î':return -0x29;
    case 'Ï':return -0x28;
    case '|':return -0x23;
    case 'Ì':return -0x22;
    case 'Ó':return -0x20;
    case 'Ô':return -0x1E;
    case 'Ò':return -0x1D;
    case 'Ú':return -0x17;
    case 'Û':return -0x16;
    case 'Ù':return -0x15;
    case 'ý':return -0x14;
    case 'Ý':return -0x13;
    case '´':return -0x11;
    case '¨':return -0x07;
    default:return 0x3F;
    }
    }
    }

    byte method2(char sChar){
      if ((sChar >= 0x0000) && (sChar < 0x0080)) {
        return (byte)sChar;
      }
     else {
    switch (sChar) {
    case 'Ç':      return -0x80;
    case 'ü':    return -0x7F;
    case 'â':  return -0x7D;
    case 'ä':return -0x7C;
    case 'à':return -0x7B;
    case 'å':return -0x7A;
    case 'ç':return -0x79;
    case 'ê':return -0x78;
    case 'ë':return -0x77;
    case 'è':return -0x76;
    case 'ï':return -0x75;
    case 'î':return -0x74;
    case 'ì':return -0x73;
    case 'Ä':return -0x72;
    case 'Å':return -0x71;
    case 'É':return -0x70;
    case 'æ':return -0x6F;
    case 'Æ':return -0x6E;
    case 'ô':return -0x6D;
    case 'ö':return -0x6C;
    case 'ò':return -0x6B;
    case 'û':return -0x6A;
    case 'ù':return -0x69;
    case 'ÿ':return -0x68;
    case 'Ö':return -0x67;
    case 'Ü':return -0x66;
    case 'ø':return -0x65;
    case '£':return -0x64;
    case 'Ø':return -0x63;
    case '×':return -0x62;
    case 'á':return -0x60;
    case 'é':return -0x7E;
    case 'í':return -0x5F;
    case 'ó':return -0x5E;
    case 'ú':return -0x5D;
    case 'ñ':return -0x5C;
    case 'Ñ':return -0x5B;
    case 'ª':return -0x5A;
    case 'º':return -0x59;
    case '¿':return -0x58;
    case '®':return -0x57;
    case '¬':return -0x56;
    case '½':return -0x55;
    case '¼':return -0x54;
    case '¡':return -0x53;
    case '«':return -0x52;
    case '»':return -0x51;
    case '░':return -0x50;
    case '▒':return -0x4F;
    case '▓':return -0x4E;
    case '│':return -0x4D;
    case '┤':return -0x4C;
    case 'Á':return -0x4B;
    case 'Â':return -0x4A;
    case 'À':return -0x49;
    case '©':return -0x48;
    case '╣':return -0x47;
    case '║':return -0x46;
    case '╗':return -0x45;
    case '╝':return -0x44;
    case '¢':return -0x43;
    case '¥':return -0x42;
    case '┐':return -0x41;
    case '└':return -0x40;
    case 'Ê':return -0x2E;
    case 'Ë':return -0x2D;
    case 'È':return -0x2C;
    case '€':return -0x2B;
    case 'Í':return -0x2A;
    case 'Î':return -0x29;
    case 'Ï':return -0x28;
    case '|':return -0x23;
    case 'Ì':return -0x22;
    case 'Ó':return -0x20;
    case 'Ô':return -0x1E;
    case 'Ò':return -0x1D;
    case 'Ú':return -0x17;
    case 'Û':return -0x16;
    case 'Ù':return -0x15;
    case 'ý':return -0x14;
    case 'Ý':return -0x13;
    case '´':return -0x11;
    case '¨':return -0x07;
    default:return 0x3F;
    }
    }
    }
}
