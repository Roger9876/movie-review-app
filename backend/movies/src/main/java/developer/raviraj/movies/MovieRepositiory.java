package developer.raviraj.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositiory extends MongoRepository<Movie, ObjectId>{
  Optional<Movie> findMovieByImdbId(String imdbId);
}
