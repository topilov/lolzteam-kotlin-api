package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.utils.HttpMethod

@JsonIgnoreProperties(ignoreUnknown = true)
open class BatchRequest(
    @JsonProperty("id") open val id: String = "null",
    @JsonProperty("uri") open val uri: String = "null",
    @JsonProperty("method") open val method: HttpMethod = HttpMethod.GET,
    @JsonProperty("params") open val params: Map<String, Any?> = emptyMap(),
)
