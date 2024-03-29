package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User
import me.topilov.data.user.UsersLinks

data class UsersResponse(
    @JsonProperty("users") val users: List<User> = emptyList(),
    @JsonProperty("users_total") val total: Int,
    @JsonProperty("links") val links: UsersLinks,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
