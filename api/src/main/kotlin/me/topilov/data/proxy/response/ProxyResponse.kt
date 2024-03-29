package me.topilov.data.proxy.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.SystemInfo
import me.topilov.data.proxy.Proxy
import me.topilov.deserializer.MapDeserializer

data class ProxyResponse(
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("proxies") val proxies: Map<String, Proxy> = emptyMap(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
