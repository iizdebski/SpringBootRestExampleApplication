package ua.izdepskyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.izdepskyi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
