package newslistscreen.retrofitdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditTopNews {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("data")
    private Data data;

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }




}

