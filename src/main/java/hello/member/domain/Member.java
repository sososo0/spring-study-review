package hello.member.domain;

import java.util.concurrent.atomic.AtomicLong;

public class Member {
    private static final AtomicLong idCounter = new AtomicLong(0);
    private Long id;
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        addId();
        return id;
    }

    private void addId() {
        this.id = idCounter.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
