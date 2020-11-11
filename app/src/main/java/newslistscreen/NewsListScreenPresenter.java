package newslistscreen;

import android.util.Log;

import java.util.ArrayList;

public class NewsListScreenPresenter implements MainContract.Presenter {
    static final String  TAG = "Presenter";
    private MainContract.View mView;
    private MainContract.Model mModel;

    public NewsListScreenPresenter(MainContract.View view) {
        this.mView = view;
        this.mModel = new NewsListScreenModel(this);
        mModel.loadNews();
    }

    @Override
    public void updateUI(ArrayList names) {
        mView.updateAdapter(names);
        Log.d(TAG, "Внутри updateUI");
    }


}
