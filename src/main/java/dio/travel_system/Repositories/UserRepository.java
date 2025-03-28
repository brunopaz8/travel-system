package dio.travel_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.travel_system.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsBycpf(String cpf);
    
}
