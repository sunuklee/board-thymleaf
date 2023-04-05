package idusw.springboot.boardthymleaf.controller;

import idusw.springboot.boardthymleaf.entitiy.MemoEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import idusw.springboot.boardthymleaf.repository.MemoRepository;

import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    MemoRepository memoRepository;

    @GetMapping("/")
    public String goHome(){
        IntStream.rangeClosed(1, 10).forEach(i ->{
            MemoEntitiy memo = MemoEntitiy.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return "index";
    }
}
