package hello.member.dto.response;

import hello.member.domain.Member;

import java.util.List;
import java.util.stream.Collectors;

public class MemberResponse {

    public record CreateMemberResponseDto(
            Long id,
            String name,
            int age
    ) {
        public CreateMemberResponseDto(Member member) {
            this(
                    member.getId(),
                    member.getName(),
                    member.getAge()
            );
        }
    }

    public record GetMemberResponseDto(
            List<MemberDto> members
    ) {
        public static GetMemberResponseDto of(List<Member> members) {
            return new GetMemberResponseDto(members.stream().map(MemberDto::new).collect(Collectors.toList()));
        }

        public record MemberDto(
                Long id,
                String name,
                int age
        ) {
            public MemberDto(Member member) {
                this(
                        member.getId(),
                        member.getName(),
                        member.getAge()
                );
            }
        }
    }

}
