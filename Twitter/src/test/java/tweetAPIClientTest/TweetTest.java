package tweetAPIClientTest;

import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tweet.TweetAPIClient;

import java.util.UUID;

public class TweetTest {

    private TweetAPIClient tweetAPIClient;
    ValidatableResponse response;

    @BeforeClass
    public void setUpTweetAPI(){

        this.tweetAPIClient=new TweetAPIClient();
    }

    @Test
    public void TestCreateTweet(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="Practice again again"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet= response.extract().body().path("text");
        Assert.assertEquals(actualTweet,tweet,"Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }

    @Test
    public void TestReplyTweet(){
        String replyTweet="Practice Reply Tweet"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);

    }

    @Test
    public void TestReTweet(){
//        String replyTweet="We are Learning Reply Tweet"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.reTweet();
        response.statusCode(200);

    }

    @Test
    public void testDelete(){
        String tweet="Practice again again4f1b822b-1b69-42b3-8be9-06449e507ece";
        ValidatableResponse response=this.tweetAPIClient.deleteTweet(1309547525922107393l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
    }

    @Test
    public void testGetTweet(){
        String tweet="updating my second tweet";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1306351439917338624l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }

    @Test
    public void testLookUpTweet(){
        String tweet="updating my second tweet";
        ValidatableResponse response=this.tweetAPIClient.lookUpTweet(1306351439917338624l,1291267565306679296l,1309130468357533700l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
//        String actualTweet=response.extract().body().path("text");
//        org.junit.Assert.assertEquals(tweet,actualTweet);
        //System.out.println(actualTweet);
        System.out.println(tweet);
    }



}