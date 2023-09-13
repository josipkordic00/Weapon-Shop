package ba.sum.fpmoz.weapon.repositories;

import ba.sum.fpmoz.weapon.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {}