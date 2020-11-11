package newslistscreen;

import java.util.ArrayList;

public interface MainContract {

    interface View {

        void updateAdapter(ArrayList sNames);
    }

    interface Presenter {
        void updateUI (ArrayList names);
    }

    interface Model {

        void loadNews();

    }
}
