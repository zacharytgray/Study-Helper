public class Flashcard {
    String term;
    String definition;
    boolean learned = false;
    public Flashcard() {
        this.term = "Term";
        this.definition = "Definition";
    }
    public Flashcard(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    public boolean isLearned() {
        return this.learned;
    }

    public void setLearned(boolean learned) {
        this.learned = learned;
    }

    public String toString() {
        return this.term + ": \n" + this.definition + "\n";
    }
}
