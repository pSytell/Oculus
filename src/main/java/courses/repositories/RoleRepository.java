package courses.repositories;

import courses.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;

public interface RoleRepository extends JpaRepository<Roles, Integer>{
}
