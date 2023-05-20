-if class com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto
-keepnames class com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto
-if class com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDto
-keep class com.balabanova.humblr.data.api.dto.subredditDto.SubredditListingDtoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
