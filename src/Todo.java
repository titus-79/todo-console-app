public class Todo {
    private int id;
    private String title;
    private boolean completed;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        String status = completed ? "[✓]" : "[✗]";
        return status + " " + id + ". " + title;
    }
}
