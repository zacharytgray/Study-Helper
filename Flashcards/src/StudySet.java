import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudySet {
    ArrayList<Flashcard> studySet;

    public StudySet() {
        studySet = new ArrayList<Flashcard>();
    }

    public void addFlashcard(Flashcard card) {
        studySet.add(card);
    }

    public Flashcard drawCard() {
        int index = (int)(Math.random() * (studySet.size()-1));
        return studySet.get(index);
    }

    public String toString() {
        String result = "";
        for (Flashcard fc:
             studySet) {
            result += fc + "~~~~~~~~~~~~~~~~~~~~\n";
        }
        return result;
    }
}
