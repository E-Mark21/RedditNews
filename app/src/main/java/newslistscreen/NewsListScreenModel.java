

package newslistscreen;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

import newslistscreen.retrofitdata.Data;
import newslistscreen.retrofitdata.News;
import newslistscreen.retrofitdata.NewsArray;
import newslistscreen.retrofitdata.RedditTopNews;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class NewsListScreenModel implements MainContract.Model {
    static final String  TAG = "Model";
    private static String BASE_URL = "https://www.reddit.com/";
    private MainContract.Presenter mPresenter;
    ArrayList<String> names = new ArrayList<>();

    ObjectMapper mObjectMapper = new ObjectMapper();
    Retrofit mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create(mObjectMapper))
            .build();
    IAPIReddit mIAPIReddit = mRetrofit.create(IAPIReddit.class);


    public NewsListScreenModel(MainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void loadNews() {
        Call<RedditTopNews> call = mIAPIReddit.getNews(10);
        call.enqueue(new Callback<RedditTopNews>() {
            @Override
            public void onResponse(Call<RedditTopNews> call, Response<RedditTopNews> response) {
                RedditTopNews redditTopNews = response.body();
                Data topNewsFromReddit = redditTopNews.getData();
                List<NewsArray> newsArrayList = new ArrayList<>(topNewsFromReddit.getNewsArray());
                for (int i = 0; i < newsArrayList.size(); i++) {
                    NewsArray newsArray = newsArrayList.get(i);
                    News news = newsArray.getNews();
                    names.add(news.getAuthor());
                    mPresenter.updateUI(names);
                    Log.d(TAG, "Внутри онРеспонз");

                }
            }

            @Override
            public void onFailure(Call<RedditTopNews> call, Throwable t) {

            }
        });
    }

}
