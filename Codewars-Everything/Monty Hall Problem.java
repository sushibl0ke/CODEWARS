import java.util.Arrays;

public class MontyHall {

    public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
      
        long pobediteli = Arrays.stream(participantGuesses)
                .filter(door -> door != correctDoorNumber)
                .count();
      
        return (int) Math.round(100.0 * pobediteli / participantGuesses.length);
      
    }
}
