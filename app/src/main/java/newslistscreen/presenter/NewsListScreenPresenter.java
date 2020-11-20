package newslistscreen.presenter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import newslistscreen.contract.MainContract;
import newslistscreen.model.NewsListScreenModel;

public class NewsListScreenPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private MainContract.Model mModel;

    public NewsListScreenPresenter(MainContract.View view) {
        this.mView = view;
        this.mModel = new NewsListScreenModel(this);
        mModel.loadNews();
    }

    @Override
    public void updateUI(ArrayList author, ArrayList posted, ArrayList num_comments, ArrayList thumbnail, ArrayList url, ArrayList title) {
        ArrayList<Integer> timePublic = new ArrayList<>();
        for (int i =0; i < posted.size(); i++) {
            timePublic.add(getTimePublic((Integer) posted.get(i)));
        }

        mView.updateAdapter(author, timePublic, num_comments, thumbnail, url, title);
    }

    private int getTimePublic(Integer posted) {
        Calendar calendar = new GregorianCalendar();
        Date today = calendar.getTime();
        long milSec = posted * 1000L;
        long duration = today.getTime() - milSec;
        int hours = (int) (duration / (60 * 60 * 1000));
        return hours;
    }
}
