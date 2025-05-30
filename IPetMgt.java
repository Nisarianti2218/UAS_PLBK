import java.util.List;

public interface IPetMgt {
    void addPet(Pet pet);

    List<Pet> getAllPets();

    Pet getPetById(int id);

    int getNextPetId();
}
