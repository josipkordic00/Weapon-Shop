package ba.sum.fpmoz.weapon.repositories;

import ba.sum.fpmoz.weapon.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {}