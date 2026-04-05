package all;

public class ClonePair8256 {

    String method1(int d,int m){
      if (d == 0x0000) {
        return "Miscellaneous";
      }
     else   if (d == 0x0100 && m == 0x00) {
        return "Uncategorized";
      }
     else   if (d == 0x0100 && m == 0x04) {
        return "Workstation";
      }
     else   if (d == 0x0100 && m == 0x08) {
        return "Server";
      }
     else   if (d == 0x0100 && m == 0x0C) {
        return "Laptop";
      }
     else   if (d == 0x0100 && m == 0x10) {
        return "HandheldPcPda";
      }
     else   if (d == 0x0100 && m == 0x14) {
        return "PalmPcPda";
      }
     else   if (d == 0x0100 && m == 0x18) {
        return "Wearable";
      }
     else   if (d == 0x0200 && m == 0x00) {
        return "Uncategorized";
      }
     else   if (d == 0x0200 && m == 0x04) {
        return "Cellular";
      }
     else   if (d == 0x0200 && m == 0x08) {
        return "Cordless";
      }
     else   if (d == 0x0200 && m == 0x0C) {
        return "SmartPhone";
      }
     else   if (d == 0x0200 && m == 0x10) {
        return "Modem";
      }
     else   if (d == 0x0200 && m == 0x14) {
        return "ISDN";
      }
     else   if (d == 0x0300 && m == 0x00) {
        return "FullyAvailable";
      }
     else   if (d == 0x0300 && m == 0x20) {
        return "1to17%Utilized";
      }
     else   if (d == 0x0300 && m == 0x40) {
        return "17to33%Utilized";
      }
     else   if (d == 0x0300 && m == 0x60) {
        return "33to50%Utilized";
      }
     else   if (d == 0x0300 && m == 0x80) {
        return "50to67%Utilized";
      }
     else   if (d == 0x0300 && m == 0xA0) {
        return "67to83%Utilized";
      }
     else   if (d == 0x0300 && m == 0xC0) {
        return "83to100%Utilized";
      }
     else   if (d == 0x0300 && m == 0xE0) {
        return "NoServiceAvailable";
      }
     else   if (d == 0x0400 && m == 0x00) {
        return "Uncategorized";
      }
     else   if (d == 0x0400 && m == 0x04) {
        return "Headset";
      }
     else   if (d == 0x0400 && m == 0x08) {
        return "HandsFree";
      }
     else   if (d == 0x0400 && m == 0x0C) {
        return "(Reserved)";
      }
     else   if (d == 0x0400 && m == 0x10) {
        return "Microphone";
      }
     else   if (d == 0x0400 && m == 0x14) {
        return "Loudspeaker";
      }
     else   if (d == 0x0400 && m == 0x18) {
        return "Headphones";
      }
     else   if (d == 0x0400 && m == 0x1C) {
        return "PortableAudio";
      }
     else   if (d == 0x0400 && m == 0x20) {
        return "CarAudio";
      }
     else   if (d == 0x0400 && m == 0x24) {
        return "SetTopBox";
      }
     else   if (d == 0x0400 && m == 0x28) {
        return "HiFiAudioDevice";
      }
     else   if (d == 0x0400 && m == 0x2C) {
        return "VCR";
      }
     else   if (d == 0x0400 && m == 0x30) {
        return "VideoCamera";
      }
     else   if (d == 0x0400 && m == 0x34) {
        return "Camcorder";
      }
     else   if (d == 0x0400 && m == 0x38) {
        return "VideoMonitor";
      }
     else   if (d == 0x0400 && m == 0x3C) {
        return "VideoDisplayAndLoudspeaker";
      }
     else   if (d == 0x0400 && m == 0x40) {
        return "VideoConferencing";
      }
     else   if (d == 0x0400 && m == 0x44) {
        return "(Reserved)";
      }
     else   if (d == 0x0400 && m == 0x48) {
        return "GamingToy";
      }
     else   if (d == 0x0500 && m == 0x00) {
        return "Uncategoried";
      }
     else   if (d == 0x0500 && m == 0x04) {
        return "Joystick";
      }
     else   if (d == 0x0500 && m == 0x08) {
        return "Gamepad";
      }
     else   if (d == 0x0500 && m == 0x0C) {
        return "RemoteControl";
      }
     else   if (d == 0x0500 && m == 0x10) {
        return "SensingDevice";
      }
     else   if (d == 0x0500 && m == 0x14) {
        return "DigitizerTablet";
      }
     else   if (d == 0x0500 && m == 0x18) {
        return "CardReader";
      }
     else   if (d == 0x0500 && m == 0x40) {
        return "Keyboard";
      }
     else   if (d == 0x0500 && m == 0x80) {
        return "PointingDevice";
      }
     else   if (d == 0x0500 && m == 0xC0) {
        return "KeyboardPointingDevice";
      }
     else   if (d == 0x0600 && m == 0x10) {
        return "Display";
      }
     else   if (d == 0x0600 && m == 0x20) {
        return "Camera";
      }
     else   if (d == 0x0600 && m == 0x40) {
        return "Scanner";
      }
     else   if (d == 0x0600 && m == 0x80) {
        return "Printer";
      }
     else   if (d == 0x1F00) {
        return "Uncategorized(" + m + ")";
      }
     else {
        return "UnknownMinorDevice(" + m + ")";
      }
    }

    String method2(int d,int m){
      if (d == 0x0000)   return "Miscellaneous";
     else   if (d == 0x0100 && m == 0x00)   return "Uncategorized";
     else   if (d == 0x0100 && m == 0x04)   return "Workstation";
     else   if (d == 0x0100 && m == 0x08)   return "Server";
     else   if (d == 0x0100 && m == 0x0C)   return "Laptop";
     else   if (d == 0x0100 && m == 0x10)   return "HandheldPcPda";
     else   if (d == 0x0100 && m == 0x14)   return "PalmPcPda";
     else   if (d == 0x0100 && m == 0x18)   return "Wearable";
     else   if (d == 0x0200 && m == 0x00)   return "Uncategorized";
     else   if (d == 0x0200 && m == 0x04)   return "Cellular";
     else   if (d == 0x0200 && m == 0x08)   return "Cordless";
     else   if (d == 0x0200 && m == 0x0C)   return "SmartPhone";
     else   if (d == 0x0200 && m == 0x10)   return "Modem";
     else   if (d == 0x0200 && m == 0x14)   return "ISDN";
     else   if (d == 0x0300 && m == 0x00)   return "FullyAvailable";
     else   if (d == 0x0300 && m == 0x20)   return "1to17%Utilized";
     else   if (d == 0x0300 && m == 0x40)   return "17to33%Utilized";
     else   if (d == 0x0300 && m == 0x60)   return "33to50%Utilized";
     else   if (d == 0x0300 && m == 0x80)   return "50to67%Utilized";
     else   if (d == 0x0300 && m == 0xA0)   return "67to83%Utilized";
     else   if (d == 0x0300 && m == 0xC0)   return "83to100%Utilized";
     else   if (d == 0x0300 && m == 0xE0)   return "NoServiceAvailable";
     else   if (d == 0x0400 && m == 0x00)   return "Uncategorized";
     else   if (d == 0x0400 && m == 0x04)   return "Headset";
     else   if (d == 0x0400 && m == 0x08)   return "HandsFree";
     else   if (d == 0x0400 && m == 0x0C)   return "(Reserved)";
     else   if (d == 0x0400 && m == 0x10)   return "Microphone";
     else   if (d == 0x0400 && m == 0x14)   return "Loudspeaker";
     else   if (d == 0x0400 && m == 0x18)   return "Headphones";
     else   if (d == 0x0400 && m == 0x1C)   return "PortableAudio";
     else   if (d == 0x0400 && m == 0x20)   return "CarAudio";
     else   if (d == 0x0400 && m == 0x24)   return "SetTopBox";
     else   if (d == 0x0400 && m == 0x28)   return "HiFiAudioDevice";
     else   if (d == 0x0400 && m == 0x2C)   return "VCR";
     else   if (d == 0x0400 && m == 0x30)   return "VideoCamera";
     else   if (d == 0x0400 && m == 0x34)   return "Camcorder";
     else   if (d == 0x0400 && m == 0x38)   return "VideoMonitor";
     else   if (d == 0x0400 && m == 0x3C)   return "VideoDisplayAndLoudspeaker";
     else   if (d == 0x0400 && m == 0x40)   return "VideoConferencing";
     else   if (d == 0x0400 && m == 0x44)   return "(Reserved)";
     else   if (d == 0x0400 && m == 0x48)   return "GamingToy";
     else   if (d == 0x0500 && m == 0x00)   return "Uncategoried";
     else   if (d == 0x0500 && m == 0x04)   return "Joystick";
     else   if (d == 0x0500 && m == 0x08)   return "Gamepad";
     else   if (d == 0x0500 && m == 0x0C)   return "RemoteControl";
     else   if (d == 0x0500 && m == 0x10)   return "SensingDevice";
     else   if (d == 0x0500 && m == 0x14)   return "DigitizerTablet";
     else   if (d == 0x0500 && m == 0x18)   return "CardReader";
     else   if (d == 0x0500 && m == 0x40)   return "Keyboard";
     else   if (d == 0x0500 && m == 0x80)   return "PointingDevice";
     else   if (d == 0x0500 && m == 0xC0)   return "KeyboardPointingDevice";
     else   if (d == 0x0600 && m == 0x10)   return "Display";
     else   if (d == 0x0600 && m == 0x20)   return "Camera";
     else   if (d == 0x0600 && m == 0x40)   return "Scanner";
     else   if (d == 0x0600 && m == 0x80)   return "Printer";
     else   if (d == 0x1F00)   return "Uncategorized(" + m + ")";
     else   return "UnknownMinorDevice(" + m + ")";
    }
}
