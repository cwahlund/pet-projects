package pet.park.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pet.park.entity.Contributor;
import java.util.Optional;

public interface ContributorDao extends JpaRepository<Contributor, Long> {

	Optional<Contributor> findByContributorEmail(String contributorEmail);

}
