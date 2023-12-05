package hello.member.dto.request;

import hello.member.domain.Member;

public class MemberRequest {

    public record createMemberRequestDto(
            String name,
            int age
    ) {
        public Member toEntity() {
            return new Member(name, age);
        }
    }

}
