package newslistscreen;

public class NewsListScreenPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private MainContract.Model mModel;

    public NewsListScreenPresenter(MainContract.View view) {
        this.mView = view;
        this.mModel = new NewsListScreenModel();
    }
}
