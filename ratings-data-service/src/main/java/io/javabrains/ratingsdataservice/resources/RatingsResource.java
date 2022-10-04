package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @RequestMapping("/questions/{questionId}")
    public Rating getMovieRating(@PathVariable("questionId") String questionId) {
        return new Rating(questionId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }

    @RequestMapping("/users/{userId}/question={questionId}&rating={rating}")
    public UserRating setUserRating(@PathVariable("userId") String userId,
                                    @PathVariable("questionId") String questionId,
                                    @PathVariable("rating") String rating) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        for (int i = 0; i < userRating.getRatings().size(); i++)
            if (userRating.getRatings().get(i).getQuestionId().equals(questionId)) {
                userRating.getRatings().get(i).setRating(Integer.parseInt(rating));
                return userRating;
            }

        userRating.setRatings(Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4),
                new Rating(questionId, Integer.parseInt(rating))
        ));

        return userRating;
    }
}
