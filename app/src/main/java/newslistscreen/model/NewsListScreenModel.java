package newslistscreen.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

import newslistscreen.contract.MainContract;
import newslistscreen.model.pojo.Data;
import newslistscreen.model.pojo.News;
import newslistscreen.model.pojo.NewsArray;
import newslistscreen.model.pojo.RedditTopNews;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class NewsListScreenModel implements MainContract.Model {

    private static String BASE_URL = "https://www.reddit.com/";
    private int numberOfNews = 50;
    private MainContract.Presenter mPresenter;

    ArrayList<String> author = new ArrayList<>();
    ArrayList<String> thumbnail = new ArrayList<>();
    ArrayList<String> url = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<Integer> posted = new ArrayList<>();
    ArrayList<Integer> numComments = new ArrayList<>();

    ObjectMapper mObjectMapper = new ObjectMapper();
    Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create(mObjectMapper))
            .build();
    IAPIReddit mIAPIReddit = mRetrofit.create(IAPIReddit.class);

    public NewsListScreenModel(MainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void loadNews() {
        Call<RedditTopNews> call = mIAPIReddit.getNews(numberOfNews);
        call.enqueue(new Callback<RedditTopNews>() {
            @Override
            public void onResponse(Call<RedditTopNews> call, Response<RedditTopNews> response) {
                RedditTopNews redditTopNews = response.body();
                Data topNewsFromReddit = redditTopNews.getData();
                List<NewsArray> newsArrayList = new ArrayList<>(topNewsFromReddit.getNewsArray());
                for (int i = 0; i < newsArrayList.size(); i++) {
                    NewsArray newsArray = newsArrayList.get(i);
                    News news = newsArray.getNews();
                    author.add(news.getAuthor());
                    posted.add(news.getCreated_utc());
                    numComments.add(news.getNum_comments());
                    thumbnail.add(news.getThumbnail());
                    url.add(news.getUrl());
                    title.add(news.getTitle());
                }
                mPresenter.updateUI(author, posted, numComments, thumbnail, url, title);
            }

            @Override
            public void onFailure(Call<RedditTopNews> call, Throwable t) {

            }
        });
    }
}