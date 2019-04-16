package com.peter.android.nytimes.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.peter.android.nytimes.model.News;
import com.peter.android.nytimes.view.DetailsActivity;

/**
 * Created by Peter Zaky on 2019-04-16.
 */

public class NewsClickHandler {

    private final Context context;

    public NewsClickHandler(Context context) {
        this.context = context;
    }

    public void onSaveClick(View view, News news) {
        Intent nextInt = new Intent(view.getContext(), DetailsActivity.class);
        nextInt.putExtra("SELECTED_NEWS",news);
        context.startActivity(nextInt);
    }
}
