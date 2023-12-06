package hello.member.service;

import hello.member.domain.Member;
import hello.member.dto.request.MemberRequest;
import hello.member.dto.response.MemberResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    List<Member> members = new ArrayList<>();

    public MemberResponse.CreateMemberResponseDto saveMember(
            MemberRequest.CreateMemberRequestDto request
    ) {
        return new MemberResponse.CreateMemberResponseDto(addMember(request));
    }

    private Member addMember(
            MemberRequest.CreateMemberRequestDto request
    ) {
        Member member = request.toEntity();
        members.add(member);
        return member;
    }

    public MemberResponse.GetMemberResponseDto readMembers() {
        return MemberResponse.GetMemberResponseDto.of(members);
    }

}
