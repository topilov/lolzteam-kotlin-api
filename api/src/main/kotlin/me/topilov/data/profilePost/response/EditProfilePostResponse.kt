package me.topilov.data.profilePost.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.ProfilePost

data class EditProfilePostResponse(
    @JsonProperty("profile_post") val post: ProfilePost?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)

