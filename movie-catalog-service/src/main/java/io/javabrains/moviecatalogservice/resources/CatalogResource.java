package io.javabrains.moviecatalogservice.resources;

import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import io.javabrains.moviecatalogservice.models.QuestionAnswer;
import io.javabrains.moviecatalogservice.models.Text;
import io.javabrains.moviecatalogservice.models.Tokens;
import io.javabrains.moviecatalogservice.models.Text;
import io.javabrains.moviecatalogservice.models.QuestionAnswerRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {
    List<Text> passages = Arrays.asList(
            new Text("1", "The Father of Turkish Nation", "Mustafa Kemal was born in 1881 in Thessaloniki, Ottoman Empire.")
    );

    List<QuestionAnswer> questionAnswers = Arrays.asList(
            new QuestionAnswer("1", "When was Mustafa Kemal born?", "in 1881", "1"),
            new QuestionAnswer("2", "Who was born in 1881?", "Mustafa Kemal", "1"),
            new QuestionAnswer("3", "Where was Mustafa Kemal born?", "in Thessaloniki, Ottoman Empire", "1")
    );

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping("/passages/{passageId}")
    public List<Text> getPassage(@PathVariable("passageId") String passageId) {
        return passages.stream().filter(passage -> passage.getTextId().equals(passageId)).collect(Collectors.toList());
    }

    @RequestMapping("/questions/{passageId}")
    public List<QuestionAnswer> getCatalog(@PathVariable("passageId") String passageId) {
        return questionAnswers.stream().filter(questionAnswer -> questionAnswer.getPassage().equals(passageId)).collect(Collectors.toList());
    }
}

/*
Alternative WebClient way
Movie movie = webClientBuilder.build().get().uri("http://localhost:8082/movies/"+ rating.getMovieId())
.retrieve().bodyToMono(Movie.class).block();
*/