package chess.controller.chess;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChessController {
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String welcomeAsHTML() {
        return "index.html";
    }

    @GetMapping("/room/{name}")
    public String roomAsHTML() {
        System.out.println("hi");
        return "/roompage.html";
    }
}