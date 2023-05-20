package com.balabanova.humblr.data.api

//https://humblrmi/redirect?state=my_state&amp;code={code}
//com.example.intermediateproject://skillbox/unsplash-auth-callback?state=my_state&amp;code={code}

const val CLIENT_ID = "gXxLOu6qIfr7_rS58hXMfg"
const val CLIENT_SECRET = "qxtbGLVSzg5ThNQxY3hQzXoSkHXlTQ"
const val RESPONSE_TYPE = "code"
const val STATE = "my_state"
const val REDIRECT_URI = "com.example.intermediateproject://skillbox/unsplash-auth-callback"
const val DURATION = "permanent"
const val SCOPE = "identity edit flair history modconfig" +
            " modflair modlog modposts modwiki " +
            "mysubreddits privatemessages read report " +
            "save submit subscribe vote wikiedit wikiread"

const val AUTHREDDIT =
    "https://www.reddit.com/api/v1/authorize" +
            "?client_id=" + CLIENT_ID +
            "&response_type=" + RESPONSE_TYPE +
            "&state=" + STATE +
            "&redirect_uri=" + REDIRECT_URI +
            "&duration=" + DURATION +
            "&scope=" + SCOPE


const val TOKEN_SHARED_NAME = "pref_token"
const val TOKEN_SHARED_KEY = "token"
const val TOKEN_ENABLED_KEY = "token_enabled"
const val ONBOARDING_IS_SHOWN = "onboarding_is_shown"
