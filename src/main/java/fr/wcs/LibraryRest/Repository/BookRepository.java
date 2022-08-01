package fr.wcs.LibraryRest.Repository;

import fr.wcs.LibraryRest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    //opération de recherche par mot-clé
    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
}
