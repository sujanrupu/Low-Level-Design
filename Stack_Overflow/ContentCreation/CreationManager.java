package ContentCreation;

public class CreationManager implements Question, Answer{
    @Override
    public void makeQuestion() {
        System.out.println("Question created and posted");
    }

    @Override
    public void addType(String type) {
        System.out.println("Question category: " + type);
    }

    @Override
    public void setVisibility(String visibility) {
        System.out.println("Question access visibility updated: " + visibility);
    }

    @Override
    public void confirmQuestion() {
        System.out.println("Question content confirmed and verified");
    }

    @Override
    public void makeAnswer() {
        System.out.println("Answer successfully posted");
    }

    @Override
    public void editAnswer() {
        System.out.println("Answer successfully edited");
    }

    @Override
    public void addTags(String tag) {
        System.out.println(tag + " added to answer");
    }
}
