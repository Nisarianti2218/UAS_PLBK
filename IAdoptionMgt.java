import java.util.List;

public interface IAdoptionMgt {
    void submitRequest(User user, int petId);

    List<AdoptionRequest> getAllRequests();

    boolean approveRequest(int requestId);
}
