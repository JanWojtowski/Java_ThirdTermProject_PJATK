package Repository;

import Data.Anime;
import com.example.java_thirdtermproject_pjatk.JavaThirdTermProjectPjatkApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime,Long> {
}
