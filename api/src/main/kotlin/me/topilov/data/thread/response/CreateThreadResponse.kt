package me.topilov.data.thread.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.thread.Thread

data class CreateThreadResponse(
    @JsonProperty("thread") val thread: Thread?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
