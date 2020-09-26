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
    //tweets creation

    @Test
    public void TestCreateTweet(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="Practice makes perfect"+UUID.randomUUID().toString();
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
    public void TestCreateTweet1(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="boot camp day"+UUID.randomUUID().toString();
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
    public void TestCreateTweet2(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="i hate trump"+UUID.randomUUID().toString();
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
    public void TestCreateTweet3(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet=" Messi is better than Zidane "+UUID.randomUUID().toString();
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
    public void TestCreateTweet4(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="the lakers are winning"+UUID.randomUUID().toString();
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
    public void TestCreateTweet5(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="summer is over but the temperatures still a little high"+UUID.randomUUID().toString();
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
    public void TestCreateTweet6(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="covid19 has changed the world"+UUID.randomUUID().toString();
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
    public void TestCreateTweet7(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="the total deaths from the covid19 has surpassed 200,000"+UUID.randomUUID().toString();
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
    public void TestCreateTweet8(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="masks and hand sanitizer become essential items to have in your backpack"+UUID.randomUUID().toString();
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
    public void TestCreateTweet9(){
        //String tweet="We are learning RestAPI Automation"+ UUID.randomUUID().toString();
        String tweet="make sure you wash your hands very often, and every time you touch something"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.createTweet(tweet);
        //Verify that tweet was successful
        response.statusCode(200);
        //int actualStatusCode=response.statusCode()
        String actualTweet= response.extract().body().path("text");
        Assert.assertEquals(actualTweet,tweet,"Test Failed");
        System.out.println(tweet);
        System.out.println(actualTweet);
    }


    //reply to a tweet

    @Test
    public void TestReplyTweet(){
        String replyTweet="yes wash your hands as much as your can"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);

    }
    @Test
    public void TestReplyTweet1(){
        String replyTweet="yes absolutely "+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet2(){
        String replyTweet="this is scary world"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet3(){
        String replyTweet="yes the world has changed"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet4(){
        String replyTweet="i am gonna miss the beach and riding my bike"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet5(){
        String replyTweet="just wait till the end, the canadians are coming back"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet6(){
        String replyTweet="oh yes i agree"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet7(){
        String replyTweet="yes in less than 2 months"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet8(){
        String replyTweet="i need some sleep ia m tired"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet9(){
        String replyTweet="yes in less than 2 months"+UUID.randomUUID().toString();
        response= this.tweetAPIClient.replyTweet(replyTweet);
        response.statusCode(200);
    }
    @Test
    public void TestReplyTweet10(){
        String replyTweet="very interesting topic for the QA"+UUID.randomUUID().toString();
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
    //get tweets

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
    public void testGetTweet1(){
        String tweet="Practice again againa6261672-62d3-4027-ae24-1c755ab6e6c7";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309669405165522944l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet2(){
        String tweet="We are learning RestAPI Automation08eda4e0-4283-4e3f-a512-2a20ca2c2597";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1303302067847663617l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet3(){
        String tweet="very interesting topic for the QAe2b9cd62-b44d-4948-aabb-a2a39882796d";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309681936156237824l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet4(){
        String tweet="Welcome friends to my mentoring1";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1306370696650665984l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet5(){
        String tweet="i am gonna miss the beach and riding my bike335f6845-a0ee-4678-bede-de40330821b6";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309678467030675459l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet6(){
        String tweet="yes the world has changed332bc337-55d8-43af-8812-608da466fce2";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309677970186014720l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet7(){
        String tweet="this is scary for realb85813e3-f0ee-486d-b74b-1f8588fb3beb";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309677532774621185l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet8(){
        String tweet="yes wash your hands as much as your can7cb09348-fa11-4c68-a158-25b27c64e4fc";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1309675790578135046l);
// Verify that the tweet was successfully deleted
        response.statusCode(200);
        String actualTweet=response.extract().body().path("text");
        org.junit.Assert.assertEquals(tweet,actualTweet);
        System.out.println(actualTweet);
        System.out.println(tweet);
    }
    @Test
    public void testGetTweet9(){
        String tweet="this is my first tweet";
        ValidatableResponse response=this.tweetAPIClient.getTweet(1306042337739628544l);
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