package me.topilov.data.page.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.page.Page

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetPageResponse(
    @JsonProperty("page") val page: Page? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
