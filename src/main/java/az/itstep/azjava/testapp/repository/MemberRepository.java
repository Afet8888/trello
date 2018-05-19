package az.itstep.azjava.testapp.repository;

import az.itstep.azjava.testapp.model.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    List<Member> findAllByTeamId(Long teamId);
}
