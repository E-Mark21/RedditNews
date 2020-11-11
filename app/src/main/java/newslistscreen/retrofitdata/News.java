package newslistscreen.retrofitdata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class News {
    @JsonIgnore
    private String author_cakeday;
    @JsonIgnore
    private String approved_at_utc;
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonIgnore
    private String selftext;
    @JsonProperty("author_fullname")
    private String author_fullname;
    @JsonIgnore
    private boolean saved;
    @JsonIgnore
    private String mod_reason_title;
    @JsonIgnore
    private int gilded;
    @JsonIgnore
    private boolean clicked;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    List<String> link_flair_richtext;
    @JsonIgnore
    private String subreddit_name_prefixed;
    @JsonIgnore
    private boolean hidden;
    @JsonIgnore
    private int pwls;
    @JsonIgnore
    private String link_flair_css_class;
    @JsonIgnore
    private int downs;
    @JsonIgnore
    private int thumbnail_height;
    @JsonIgnore
    private String top_awarded_type;
    @JsonIgnore
    private boolean hide_score;
    @JsonIgnore
    private String name;
    @JsonIgnore
    private boolean quarantine;
    @JsonIgnore
    private String link_flair_text_color;
    @JsonIgnore
    private double upvote_ratio;
    @JsonIgnore
    private String author_flair_background_color;
    @JsonIgnore
    private String subreddit_type;
    @JsonIgnore
    private int ups;
    @JsonIgnore
    private int total_awards_received;
    @JsonIgnore
    private int thumbnail_width;
    @JsonIgnore
    private String author_flair_template_id;
    @JsonIgnore
    private boolean is_original_content;
    @JsonIgnore
    List<String> user_reports;
    @JsonIgnore
    private SecureMedia secureMedia;
    @JsonIgnore
    private boolean is_reddit_media_domain;
    @JsonIgnore
    private boolean is_meta;
    @JsonIgnore
    private String category;
    @JsonIgnore
    private SecureMediaEmbed secure_media_embed;
    @JsonIgnore
    private String link_flair_text;
    @JsonIgnore
    private boolean can_mod_post;
    @JsonIgnore
    private int score;
    @JsonIgnore
    private String approved_by;
    @JsonIgnore
    private boolean author_premium;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonIgnore
    private boolean edited;
    @JsonIgnore
    private String author_flair_css_class;
    @JsonIgnore
    List<String> author_flair_richtext;
    @JsonIgnore
    private Gildings gildings;
    @JsonIgnore
    private String post_hint;
    @JsonIgnore
    private String content_categories;
    @JsonIgnore
    private boolean is_self;
    @JsonIgnore
    private String mod_note;
    @JsonIgnore
    private long created;
    @JsonIgnore
    private String link_flair_type;
    @JsonIgnore
    private int wls;
    @JsonIgnore
    private String removed_by_category;
    @JsonIgnore
    private String banned_by;
    @JsonIgnore
    private String author_flair_type;
    @JsonIgnore
    private String domain;
    @JsonIgnore
    private String allow_live_comments;
    @JsonIgnore
    private String selftext_html;
    @JsonIgnore
    private String likes;
    @JsonIgnore
    private String suggested_sort;
    @JsonIgnore
    private String banned_at_utc;
    @JsonIgnore
    private String url_overridden_by_dest;
    @JsonIgnore
    private String view_count;
    @JsonIgnore
    private String archived;
    @JsonIgnore
    private String no_follow;
    @JsonIgnore
    private String is_crosspostable;
    @JsonIgnore
    private String pinned;
    @JsonIgnore
    private String over_18;
    @JsonIgnore
    private Preview preview;
    @JsonIgnore
    private AllAwardings all_awardings;
    @JsonIgnore
    List<Avarders> awarders;
    @JsonIgnore
    private String media_only;
    @JsonIgnore
    private String can_gild;
    @JsonIgnore
    private String spoiler;
    @JsonIgnore
    private String locked;
    @JsonIgnore
    private String author_flair_text;
    @JsonIgnore
    List<TreatmentsTags> treatment_tags;
    @JsonIgnore
    private boolean visited;
    @JsonIgnore
    private String removed_by;
    @JsonIgnore
    private String num_reports;
    @JsonIgnore
    private String distinguished;
    @JsonIgnore
    private String subreddit_id;
    @JsonIgnore
    private String mod_reason_by;
    @JsonIgnore
    private String removal_reason;
    @JsonIgnore
    private String link_flair_background_color;
    @JsonIgnore
    private String id;
    @JsonIgnore
    private String is_robot_indexable;
    @JsonIgnore
    private String report_reasons;
    @JsonProperty("author")
    private String author;
    @JsonIgnore
    private String discussion_type;
    @JsonProperty("num_comments")
    private int num_comments;
    @JsonIgnore
    private boolean send_replies;
    @JsonIgnore
    private String whitelist_status;
    @JsonIgnore
    private boolean contest_mode;
    @JsonIgnore
    List<ModReports> mod_reports;
    @JsonIgnore
    private boolean author_patreon_flair;
    @JsonIgnore
    private String author_flair_text_color;
    @JsonIgnore
    private String permalink;
    @JsonIgnore
    private String parent_whitelist_status;
    @JsonIgnore
    private boolean stickied;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private int subreddit_subscribers;
    @JsonProperty("created_utc")
    private int created_utc;
    @JsonIgnore
    private int num_crossposts;
    @JsonIgnore
    private String media;
    @JsonIgnore
    private boolean is_video;
    @JsonIgnore
    private MediaEmbed media_embed;
    @JsonIgnore
    private String secure_media;
    @JsonIgnore
    private String link_flair_template_id;

    public News() {
    }

    public String getLink_flair_template_id() {
        return link_flair_template_id;
    }

    public String getSecure_media() {
        return secure_media;
    }

    public MediaEmbed getMedia_embed() {
        return media_embed;
    }

    public String getApproved_at_utc() {
        return approved_at_utc;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getSelftext() {
        return selftext;
    }

    public String getAuthor_fullname() {
        return author_fullname;
    }

    public boolean isSaved() {
        return saved;
    }

    public String getMod_reason_title() {
        return mod_reason_title;
    }

    public int getGilded() {
        return gilded;
    }

    public boolean isClicked() {
        return clicked;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getLink_flair_richtext() {
        return link_flair_richtext;
    }

    public String getSubreddit_name_prefixed() {
        return subreddit_name_prefixed;
    }

    public boolean isHidden() {
        return hidden;
    }

    public int getPwls() {
        return pwls;
    }

    public String getLink_flair_css_class() {
        return link_flair_css_class;
    }

    public int getDowns() {
        return downs;
    }

    public int getThumbnail_height() {
        return thumbnail_height;
    }

    public String getTop_awarded_type() {
        return top_awarded_type;
    }

    public boolean isHide_score() {
        return hide_score;
    }

    public String getName() {
        return name;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public String getLink_flair_text_color() {
        return link_flair_text_color;
    }

    public double getUpvote_ratio() {
        return upvote_ratio;
    }

    public String getAuthor_flair_background_color() {
        return author_flair_background_color;
    }

    public String getSubreddit_type() {
        return subreddit_type;
    }

    public int getUps() {
        return ups;
    }

    public int getTotal_awards_received() {
        return total_awards_received;
    }

    public int getThumbnail_width() {
        return thumbnail_width;
    }

    public String getAuthor_flair_template_id() {
        return author_flair_template_id;
    }

    public boolean isIs_original_content() {
        return is_original_content;
    }

    public List<String> getUser_reports() {
        return user_reports;
    }

    public SecureMedia getSecureMedia() {
        return secureMedia;
    }

    public boolean isIs_reddit_media_domain() {
        return is_reddit_media_domain;
    }

    public boolean isIs_meta() {
        return is_meta;
    }

    public String getCategory() {
        return category;
    }

    public SecureMediaEmbed getSecure_media_embed() {
        return secure_media_embed;
    }

    public String getLink_flair_text() {
        return link_flair_text;
    }

    public boolean isCan_mod_post() {
        return can_mod_post;
    }

    public int getScore() {
        return score;
    }

    public String getApproved_by() {
        return approved_by;
    }

    public boolean isAuthor_premium() {
        return author_premium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public boolean isEdited() {
        return edited;
    }

    public String getAuthor_flair_css_class() {
        return author_flair_css_class;
    }

    public List<String> getAuthor_flair_richtext() {
        return author_flair_richtext;
    }

    public Gildings getGildings() {
        return gildings;
    }

    public String getPost_hint() {
        return post_hint;
    }

    public String getContent_categories() {
        return content_categories;
    }

    public boolean isIs_self() {
        return is_self;
    }

    public String getMod_note() {
        return mod_note;
    }

    public long getCreated() {
        return created;
    }

    public String getLink_flair_type() {
        return link_flair_type;
    }

    public int getWls() {
        return wls;
    }

    public String getRemoved_by_category() {
        return removed_by_category;
    }

    public String getBanned_by() {
        return banned_by;
    }

    public String getAuthor_flair_type() {
        return author_flair_type;
    }

    public String getDomain() {
        return domain;
    }

    public String getAllow_live_comments() {
        return allow_live_comments;
    }

    public String getSelftext_html() {
        return selftext_html;
    }

    public String getLikes() {
        return likes;
    }

    public String getSuggested_sort() {
        return suggested_sort;
    }

    public String getBanned_at_utc() {
        return banned_at_utc;
    }

    public String getUrl_overridden_by_dest() {
        return url_overridden_by_dest;
    }

    public String getView_count() {
        return view_count;
    }

    public String getArchived() {
        return archived;
    }

    public String getNo_follow() {
        return no_follow;
    }

    public String getIs_crosspostable() {
        return is_crosspostable;
    }

    public String getPinned() {
        return pinned;
    }

    public String getOver_18() {
        return over_18;
    }

    public Preview getPreview() {
        return preview;
    }

    public AllAwardings getAll_awardings() {
        return all_awardings;
    }

    public List<Avarders> getAwarders() {
        return awarders;
    }

    public String getMedia_only() {
        return media_only;
    }

    public String getCan_gild() {
        return can_gild;
    }

    public String getSpoiler() {
        return spoiler;
    }

    public String getLocked() {
        return locked;
    }

    public String getAuthor_flair_text() {
        return author_flair_text;
    }

    public List<TreatmentsTags> getTreatment_tags() {
        return treatment_tags;
    }

    public boolean isVisited() {
        return visited;
    }

    public String getRemoved_by() {
        return removed_by;
    }

    public String getNum_reports() {
        return num_reports;
    }

    public String getDistinguished() {
        return distinguished;
    }

    public String getSubreddit_id() {
        return subreddit_id;
    }

    public String getMod_reason_by() {
        return mod_reason_by;
    }

    public String getRemoval_reason() {
        return removal_reason;
    }

    public String getLink_flair_background_color() {
        return link_flair_background_color;
    }

    public String getId() {
        return id;
    }

    public String getIs_robot_indexable() {
        return is_robot_indexable;
    }

    public String getReport_reasons() {
        return report_reasons;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscussion_type() {
        return discussion_type;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public boolean isSend_replies() {
        return send_replies;
    }

    public String getWhitelist_status() {
        return whitelist_status;
    }

    public boolean isContest_mode() {
        return contest_mode;
    }

    public List<ModReports> getMod_reports() {
        return mod_reports;
    }

    public boolean isAuthor_patreon_flair() {
        return author_patreon_flair;
    }

    public String getAuthor_flair_text_color() {
        return author_flair_text_color;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getParent_whitelist_status() {
        return parent_whitelist_status;
    }

    public boolean isStickied() {
        return stickied;
    }

    public String getUrl() {
        return url;
    }

    public int getSubreddit_subscribers() {
        return subreddit_subscribers;
    }

    public int getCreated_utc() {
        return created_utc;
    }

    public int getNum_crossposts() {
        return num_crossposts;
    }

    public String getMedia() {
        return media;
    }

    public boolean isIs_video() {
        return is_video;
    }

    public String getAuthor_cakeday() {
        return author_cakeday;
    }
}
