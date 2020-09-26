package tweet;

import base.CommonAPI;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TweetAPIClient extends CommonAPI {

    private final String CREATE_TWEET_ENDPOINT = "/statuses/update.json";

    private final String REPLY_USER_TWEET_ENDPOINT="/statuses/update.json";

    private final String DELETE_TWEET_ENDPOINT="/statuses/destroy.json";

    private final String GET_USER_TWEET_ENDPOINT="/statuses/show.json";

    private final String UPDATE_USER_TWEET_ENDPOINT="";

    private final String LOOKUP_USER_TWEET_ENDPOINT="/statuses/lookup.json";

    private final String RETWEET_USER_TWEET_ENDPOINT="statuses/retweet/1306802875448795136.json";



    // Create a Tweet From user Twitter
    public ValidatableResponse createTweet(String tweet){

        return given().auth().oauth(apiKey,apiSecretKey,accessToken,accessTokenSecret)
                .param("status", tweet)
                .when().post(baseUrl + CREATE_TWEET_ENDPOINT)
                .then();
    }

    // Reply to the Tweet

    public ValidatableResponse replyTweet(String replyTweet){

        return given().auth().oauth(apiKey,apiSecretKey,accessToken,accessTokenSecret)
                .param("status", replyTweet)
                .param("in_reply_to_status_id","1309378350012604417")
                .when().post(baseUrl + REPLY_USER_TWEET_ENDPOINT)
                .then();

    }

    // Delete Tweet

    public ValidatableResponse deleteTweet(Long tweetId) {
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .queryParam("id", tweetId)
                .when().post(baseUrl + DELETE_TWEET_ENDPOINT)
                .then();
    }



    public ValidatableResponse reTweet() {


        return  given().auth().oauth(apiKey,apiSecretKey,accessToken,accessTokenSecret)
//                .param("status", reTweet)
//                .param("id",reTweet)
                .when().post(baseUrl + RETWEET_USER_TWEET_ENDPOINT)
                .then();


    }
    // Get a Tweet


    public ValidatableResponse getTweet(Long tweetId) {
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .queryParam("id", tweetId)
                .when().get(baseUrl + GET_USER_TWEET_ENDPOINT)
                .then();
    }

    // Get a LOOKUP TweetS




    public ValidatableResponse lookUpTweet(Long tweetId1, long tweetId2, long tweetId3) {
        return given().auth().oauth(apiKey, apiSecretKey, accessToken, accessTokenSecret)
                .queryParam("id", tweetId1, tweetId2, tweetId3)
                .when().get(baseUrl + LOOKUP_USER_TWEET_ENDPOINT)
                .then();
    }



}