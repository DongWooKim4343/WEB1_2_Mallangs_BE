package com.mallangs.domain.chat.controller.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Tag(name = "테스트용 컨트롤러 사용 X", description = " 테스트용 사용 X")
public class ChatViewControllerTest {

//    @GetMapping("/")
//    @Operation(summary = "테스트 사용X", description = "테스트용 컨트롤러 사용X")
//    public String homePage() {
//        return "index"; // index.html 템플릿 반환
//    }

    @GetMapping("/chat-rooms")
    @Operation(summary = "테스트 사용X", description = "테스트용 컨트롤러 사용X")
    public String chatRoomListPage() {
        return "message/room"; // room.html 템플릿 반환
    }

}

