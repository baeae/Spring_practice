package sample07;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller("controller")//<bean class="" id=""/>
@RequiredArgsConstructor// final필드 또는 @Nonull이 선언된 필드를 기준으로 생성자를 생성
public class BoardController {

    //@Autowired
    private final BoardService boardService;

    @Autowired
    private BoardDTO boardDTO;

    @Autowired
    private BoardDTO boardDTO2;

//    public BoardController () {
//        System.out.println("BoardController 생성자 호출.,,");
//    }

    @PostConstruct
    public void init() {
        System.out.println("------------------------");
        System.out.println("boardDTO = " + boardDTO);
        System.out.println("boardDTO = " + boardDTO2);
    }

    public void test() {
        System.out.println("BoardController test call");
        boardService.select();
    }
}
