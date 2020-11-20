package newslistscreen.contract;


import java.util.ArrayList;

public interface MainContract {

    interface View {

        void updateAdapter(ArrayList sNames,
                           ArrayList sTimePublic,
                           ArrayList sNum_comments,
                           ArrayList sThumbnail,
                           ArrayList sUrl,
                           ArrayList sTitle);
    }

    interface Presenter {
        void updateUI(ArrayList names,
                      ArrayList<Integer> posted_by,
                      ArrayList<Integer> num_comments,
                      ArrayList<String> strings,
                      ArrayList<String> thumbnail,
                      ArrayList<String> title);
    }

    interface Model {

        void loadNews();

    }
}
