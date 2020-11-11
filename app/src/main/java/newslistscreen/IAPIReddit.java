package newslistscreen;

import newslistscreen.retrofitdata.RedditTopNews;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IAPIReddit {
    @GET("top.json")
    Call<RedditTopNews> getNews(@Query("limit") int limit);
}
