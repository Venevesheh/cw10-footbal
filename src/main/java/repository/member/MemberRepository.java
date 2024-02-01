package repository.member;

import base.repository.BaseRepository;
import model.Member;

public interface MemberRepository extends BaseRepository<Integer, Member> {


     boolean maxCoachSalary ();
}
