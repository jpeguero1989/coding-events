package QuizProject;

public abstract class Question {
    private int id;
    private static int nextId = 1;

    public String question;
    public String answer;

    public Question() {
        id = nextId;
        nextId++;
    }

    public abstract void ask();

}

