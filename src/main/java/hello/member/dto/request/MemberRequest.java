package hello.member.dto.request;

import hello.member.domain.Member;

public class MemberRequest {

    public record CreateMemberRequestDto(
            String name,
            int age
    ) {
        public Member toEntity() {
            return new Member(name, age);
        }
    }

}
