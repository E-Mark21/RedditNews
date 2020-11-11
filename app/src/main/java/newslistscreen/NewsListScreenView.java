package newslistscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myprog.redditnews.R;

import java.util.ArrayList;
import java.util.List;

public class NewsListScreenView extends Fragment implements MainContract.View {

    private MainContract.Presenter mPresenter;
    RecyclerView newsListRecyclerView;
    CardAdapter adapter;
    private static ArrayList<String> sNames = new ArrayList<>();

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
        adapter = new CardAdapter(sNames);
        newsListRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        newsListRecyclerView.setLayoutManager(layoutManager);
        return newsListRecyclerView;
    }


    class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
        List<String> names = new ArrayList<>();

        public CardAdapter(ArrayList sNames) {
            this.names = sNames;
        }

        public void updateItem(ArrayList names) {
            //names.clear();
            this.names = names;
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_news, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {
            holder.author.setText("");
            holder.posted_by.setText("");
            holder.num_comments.setText("");

        }

        @Override
        public int getItemCount() {
            return /*sNames.size();*/ 25;
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            TextView author, posted_by, num_comments;
            ImageView thumbnail;

            public ViewHolder(View itemView) {
                super(itemView);
                author = itemView.findViewById(R.id.author);
                posted_by = itemView.findViewById(R.id.posted_by);
                num_comments = itemView.findViewById(R.id.num_comments);
                thumbnail = itemView.findViewById(R.id.thumbnail);
            }
        }
    }

    @Override
    public void updateAdapter(ArrayList sNames) {
        if (adapter == null) {
            adapter = new CardAdapter(sNames);
            newsListRecyclerView.setAdapter(adapter);
        } else {
            adapter.updateItem(sNames);
            adapter.notifyDataSetChanged();
        }
    }
}
