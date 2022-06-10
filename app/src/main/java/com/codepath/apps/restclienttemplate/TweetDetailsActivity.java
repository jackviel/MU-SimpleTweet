package com.codepath.apps.restclienttemplate;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class TweetDetailsActivity extends AppCompatActivity {

    // the movie to display
    Tweet tweet;

    TextView tvUsername;
    TextView tvBody;
    ImageView ivProfilePic;
    ImageView ivTweetImage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_details);
        // resolve the view objects
        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvBody = (TextView) findViewById(R.id.tvBody);
        ivProfilePic = (ImageView) findViewById(R.id.ivProfilePic);
        ivTweetImage = (ImageView) findViewById(R.id.ivTweetImage);

        // unwrap the movie passed in via intent, using its simple name as a key
        tweet = (Tweet) Parcels.unwrap(getIntent().getParcelableExtra(Tweet.class.getSimpleName()));

        // set the title and overview
        //tvUsername.setText(tweet.getUsername());
        //tvBody.setText(tweet.getBody());

       // String imageUrl = Tweet.getImgUrl();

       // Glide.with(this)
         //       .load(imageUrl)
           //     .into(ivTweetImage);
    }
}