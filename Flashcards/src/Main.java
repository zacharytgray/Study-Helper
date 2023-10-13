import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Flashcard> testCards = new ArrayList<Flashcard>();
        StudySet studySet = new StudySet();

        for (int i = 1; i < 6; i++) {
            Flashcard card = new Flashcard("Term " + i, "Definition " + i);
            studySet.addFlashcard(card);
        }

        System.out.println(studySet);

    }
}