package SpringBootTeste.Controller;

import SpringBootTeste.domain.Classeteste;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ClasseTeste")
public class ClasseTesteControler {
    //localhost:8080/ClasseTeste/list
    @GetMapping(path = "list")
    public List<Classeteste> List(){
        return List.of(new Classeteste("teste1"), new Classeteste("teste2"));
    }
}
