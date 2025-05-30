public class Pet {
    private int id;
    private String name;
    private String type;
    private String age;
    private boolean adopted;

    public Pet(int id, String name, String type, String age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAge() {
        return age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
}
