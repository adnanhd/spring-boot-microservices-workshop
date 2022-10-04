package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.QuestionAnswer;
import io.javabrains.movieinfoservice.models.QuestionSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/discovery")
public class QuestionResource {

    //@Value("${api.key}")
    //private String apiKey;

    @Autowired
    private RestTemplate restTemplate;
/*
    @RequestMapping("/{questionAnswerId}")
    public QuestionSummary getAnswer(@PathVariable("answerId") String answerId) {
        return restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + answerId + "?api_key=" +  apiKey, QuestionSummary.class);
    }

    @RequestMapping("/{questionAnswerId}")
    public QuestionAnswer getQuestion(@PathVariable("questionAnswerId") String questionId) {
        return restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + questionId + "?api_key=" + apiKey, QuestionAnswer.class);
    }
*/
    @RequestMapping("/{answerId}")
    public List<QuestionAnswer> getQuestionFromAnswer(@PathVariable("answerId") String answerId) {
        return restTemplate.getForObject("http://localhost:8081/catalog/questions/" + answerId, List.class);
    }
}
