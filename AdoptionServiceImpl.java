import java.util.ArrayList;
import java.util.List;

public class AdoptionServiceImpl implements IAdoptionMgt {
    private final List<AdoptionRequest> requests = new ArrayList<>();
    private final IPetMgt petMgt;
    private int nextRequestId = 1;

    public AdoptionServiceImpl(IPetMgt petMgt) {
        this.petMgt = petMgt;
    }

    @Override
    public void submitRequest(User user, int petId) {
        Pet pet = petMgt.getPetById(petId);
        if (pet != null && !pet.isAdopted()) {
            AdoptionRequest request = new AdoptionRequest(nextRequestId++, user, pet, "Menunggu Persetujuan");
            requests.add(request);
        }
    }

    @Override
    public List<AdoptionRequest> getAllRequests() {
        return requests;
    }

    @Override
    public boolean approveRequest(int requestId) {
        for (AdoptionRequest req : requests) {
            if (req.getId() == requestId && req.getStatus().equals("Menunggu Persetujuan")) {
                req.setStatus("Disetujui");
                Pet pet = req.getPet();
                pet.setAdopted(true); // ⬅️ Tandai hewan sudah diadopsi
                return true;
            }
        }
        return false;
    }
}
