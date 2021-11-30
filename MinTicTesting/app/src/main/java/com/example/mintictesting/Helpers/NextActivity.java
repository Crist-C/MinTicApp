package com.example.mintictesting.Helpers;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;

public class NextActivity {

    Activity activity;
    Class next;

    public NextActivity() {
    }

    public NextActivity(Activity activity, Class next) {
        this.activity = activity;
        this.next = next;
    }

    public void goToNextActivity(){
        Intent intent = new Intent(activity, next);
        activity.getWindow().setExitTransition(new Fade().setDuration(1000));
        activity.getWindow().setEnterTransition(new Fade().setDuration(1000));
        activity.getWindow().setReturnTransition(new Slide(Gravity.RIGHT).setDuration(1700));
        activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
    }



}
