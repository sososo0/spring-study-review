package hello.member.dto.response;

import hello.member.domain.Member;

public class MemberResponse {

    public record createMemberResponseDto(
            Long id,
            String name,
            int age
    ) {
        public createMemberResponseDto(Member member) {
            this(
                    member.getId(),
                    member.getName(),
                    member.getAge()
            );
        }
    }

}
