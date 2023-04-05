package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entitiy.MemoEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntitiy, Long> {

}
