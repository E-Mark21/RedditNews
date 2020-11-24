package newslistscreen.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myprog.redditnews.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private Listener mListener;

    ArrayList<String> url;
    ArrayList<String> author;
    ArrayList<String> thumbnail;
    ArrayList<String> title;
    ArrayList<Integer> timePublic;
    ArrayList<Integer> numComments;

    public CardAdapter(ArrayList sNames, ArrayList sTimePublic, ArrayList sNum_comments, ArrayList sThumbnail, ArrayList sUrl, ArrayList sTitle) {
        this.author = sNames;
        this.timePublic = sTimePublic;
        this.numComments = sNum_comments;
        this.thumbnail = sThumbnail;
        this.url = sUrl;
        this.title = sTitle;
    }

    public void updateItem(ArrayList names, ArrayList sTimePublic, ArrayList sNum_comments, ArrayList sThumbnail, ArrayList sUrl, ArrayList sTitle) {
        this.author = names;
        this.timePublic = sTimePublic;
        this.numComments = sNum_comments;
        this.thumbnail = sThumbnail;
        this.url = sUrl;
        this.title = sTitle;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.author.setText(author.get(position));
        holder.posted_by.setText(timePublic.get(position).toString());
        holder.num_comments.setText(numComments.get(position).toString());
        holder.title.setText(title.get(position));
        String picturesUrl  = url.get(position);
        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.onClick(picturesUrl);
                }
            }
        });

        Picasso.with(holder.itemView.getContext()).      // В данном примере мне кажется лучше оставить так.
                load(thumbnail.get(position))            // 4 строчки кода вместо целого метода с передачей ему параметров.
                .placeholder(R.drawable.placeholder)
                .into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return author.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView author, posted_by, num_comments, title;
        ImageView thumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            author = itemView.findViewById(R.id.author);
            posted_by = itemView.findViewById(R.id.posted_by);
            num_comments = itemView.findViewById(R.id.num_comments);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            title = itemView.findViewById(R.id.title);
        }
    }
    interface Listener {
        void onClick(String url);
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }
}
