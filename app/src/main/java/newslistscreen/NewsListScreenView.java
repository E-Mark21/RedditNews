package newslistscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myprog.redditnews.R;

public class NewsListScreenView extends Fragment implements MainContract.View {

    private MainContract.Presenter mPresenter;
    RecyclerView newsListRecyclerView;
    CardAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new NewsListScreenPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        newsListRecyclerView = (RecyclerView) inflater.inflate(
                R.layout.news_list_screen, container, false);
        adapter = new CardAdapter();
        newsListRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        newsListRecyclerView.setLayoutManager(layoutManager);
        return newsListRecyclerView;
    }


    static class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

        @NonNull
        @Override
        public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_news, parent, false);
            return new ViewHolder(cardView);
        }

        @Override
        public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 20;
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            private final CardView mCardView;

            public ViewHolder(CardView cardView) {
                super(cardView);
                mCardView = cardView;
            }
        }
    }
}
