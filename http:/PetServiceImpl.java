import java.util.ArrayList;
import java.util.List;

public class PetServiceImpl implements IPetMgt {
    private List<Pet> pets = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);
        nextId++;
    }

    @Override
    public List<Pet> getAllPets() {
        return pets;
    }

    @Override
    public Pet getPetById(int id) {
        return pets.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public int getNextPetId() {
        return nextId;
    }
}
