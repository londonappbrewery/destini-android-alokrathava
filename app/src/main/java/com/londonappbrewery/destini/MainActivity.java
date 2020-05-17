package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mTopBtn,mBottomBtn;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopBtn = (Button)findViewById(R.id.buttonTop);
        mBottomBtn = (Button)findViewById(R.id.buttonBottom);
        mStory = (TextView)findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Top Button Pressed");
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStory.setText(R.string.T3_Story);
                    mTopBtn.setText(R.string.T3_Ans1);
                    mBottomBtn.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else{
                    mStory.setText(R.string.T6_End);
                    mTopBtn.setVisibility(View.GONE);
                    mBottomBtn.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Bottom Button Pressed");
                if(mStoryIndex == 1) {
                    mStory.setText(R.string.T2_Story);
                    mTopBtn.setText(R.string.T2_Ans1);
                    mBottomBtn.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mStory.setText(R.string.T4_End);
                    mTopBtn.setVisibility(View.GONE);
                    mBottomBtn.setVisibility(View.GONE);
                } else {
                    mStory.setText(R.string.T5_End);
                    mTopBtn.setVisibility(View.GONE);
                    mBottomBtn.setVisibility(View.GONE);
                }
            }

        });

    }
}
