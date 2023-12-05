package hello.member.controller;

import hello.member.dto.request.MemberRequest;
import hello.member.dto.response.MemberResponse;
import hello.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/hello")
    public String getHello(
            @RequestParam(name = "name") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/members")
    public ResponseEntity<MemberResponse.createMemberResponseDto> createMember(
            @RequestBody MemberRequest.createMemberRequestDto request,
            Errors errors
    ) {
        MemberResponse.createMemberResponseDto response = memberService.saveMember(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .location(URI.create("/members"+response.id()))
                .body(response);
    }
}
