package hello.core.service;

import hello.core.member.Member;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRespository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRespository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
