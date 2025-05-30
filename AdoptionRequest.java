public class AdoptionRequest {
    private int id;
    private User user;
    private Pet pet;
    private String status;

    public AdoptionRequest(int id, User user, Pet pet, String status) {
        this.id = id;
        this.user = user;
        this.pet = pet;
        this.status = status;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Pet getPet() {
        return pet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
