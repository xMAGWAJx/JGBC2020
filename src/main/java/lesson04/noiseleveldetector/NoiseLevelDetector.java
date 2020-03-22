package lesson04.noiseleveldetector;

public class NoiseLevelDetector {

    public String detect(int dbNoiseLevel) {
        if (dbNoiseLevel <= 39) {
            return "Faint";
        } else if (dbNoiseLevel >= 40 && dbNoiseLevel <= 69) {
            return "Moderate";
        } else if (dbNoiseLevel >= 70 && dbNoiseLevel <= 99) {
            return "Very Loud";
        } else if (dbNoiseLevel >= 100 && dbNoiseLevel <= 129) {
            return "Extremely Loud";
        } else {
            return "Painful";
        }
    }
}
