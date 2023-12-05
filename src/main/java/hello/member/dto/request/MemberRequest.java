package hello.member.dto.request;

import hello.member.domain.Member;

public class MemberRequest {

    public record createMemberRequestDto(
            String name,
            int age
    ) {
        public createMemberRequestDto(Member member) {
            this(
                    member.getName(),
                    member.getAge()
            );
        }
    }

}
