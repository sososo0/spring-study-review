package hello.member.domain;

public class Member {
    private Long id;
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        id++;
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
