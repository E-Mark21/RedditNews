package newslistscreen.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myprog.redditnews.R;

import java.util.ArrayList;

import imageviewerscreen.ImageViewerActivity;
import newslistscreen.contract.MainContract;
import newslistscreen.presenter.NewsListScreenPresenter;

public class NewsListScreenView extends Fragment implements MainContract.View {

    private MainContract.Presenter mPresenter;
    RecyclerView newsListRecyclerView;
    CardAdapter adapter;

    private static ArrayList<String> sUrl = new ArrayList<>();
    private static ArrayList<String> sAuthor = new ArrayList<>();
    private static ArrayList<String> sThumbnail = new ArrayList<>();
    private static ArrayList<String> sTitle = new ArrayList<>();
    private static ArrayList<Integer> sTimePublic = new ArrayList<>();
    private static ArrayList<Integer > sNumComments = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new NewsListScreenPresenter(this);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        newsListRecyclerView = (RecyclerView) inflater.inflate(
                R.layout.news_list_screen, container, false);
        newsListRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        newsListRecyclerView.setLayoutManager(layoutManager);
        sAuthor.add("");
        sThumbnail.add("placeholder");
        sUrl.add("placeholder");
        sTitle.add("");
        sTimePublic.add(0);
        sNumComments.add(0);

        return newsListRecyclerView;
    }

    @Override
    public void updateAdapter(ArrayList sNames, ArrayList sTimePublic, ArrayList sNum_comments, ArrayList sThumbnail, ArrayList sUrl, ArrayList sTitle) {
        if (adapter == null) {
            adapter = new CardAdapter(sNames, sTimePublic, sNum_comments, sThumbnail, sUrl, sTitle);
            newsListRecyclerView.setAdapter(adapter);
            adapter.setListener(new CardAdapter.Listener() {
                @Override
                public void onClick(String url) {
                    Intent intent = new Intent(getActivity(), ImageViewerActivity.class);
                    intent.putExtra(ImageViewerActivity.EXTRA_URL, url);
                    startActivity(intent);
                }
            });
        } else {
            adapter.updateItem(sNames, sTimePublic, sNum_comments, sThumbnail, sUrl, sTitle);
            adapter.notifyDataSetChanged();
        }
    }
}
