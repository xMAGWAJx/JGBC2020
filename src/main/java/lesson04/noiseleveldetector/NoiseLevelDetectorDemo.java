package lesson04.noiseleveldetector;

public class NoiseLevelDetectorDemo {

    public static void main(String[] args) {

      NoiseLevelDetector detector = new NoiseLevelDetector();
      System.out.println("detector.detect(15) = " + detector.detect(15));
      System.out.println("detector.detect(39) = " + detector.detect(39));
      System.out.println("detector.detect(47) = " + detector.detect(47));
      System.out.println("detector.detect(82) = " + detector.detect(82));
      System.out.println("detector.detect(116) = " + detector.detect(116));
      System.out.println("detector.detect(149) = " + detector.detect(149));
  }
}
