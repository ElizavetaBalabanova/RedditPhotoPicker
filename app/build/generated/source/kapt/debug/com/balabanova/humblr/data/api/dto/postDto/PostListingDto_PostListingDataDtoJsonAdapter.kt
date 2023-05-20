// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.balabanova.humblr.`data`.api.dto.postDto

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class PostListingDto_PostListingDataDtoJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<PostListingDto.PostListingDataDto>() {
  private val options: JsonReader.Options = JsonReader.Options.of("after", "children", "before")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "after")

  private val listOfPostDtoAdapter: JsonAdapter<List<PostDto>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, PostDto::class.java), emptySet(),
      "children")

  private val nullableAnyAdapter: JsonAdapter<Any?> = moshi.adapter(Any::class.java, emptySet(),
      "before")

  public override fun toString(): String = buildString(55) {
      append("GeneratedJsonAdapter(").append("PostListingDto.PostListingDataDto").append(')') }

  public override fun fromJson(reader: JsonReader): PostListingDto.PostListingDataDto {
    var after: String? = null
    var children: List<PostDto>? = null
    var before: Any? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> after = nullableStringAdapter.fromJson(reader)
        1 -> children = listOfPostDtoAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("children", "children", reader)
        2 -> before = nullableAnyAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return PostListingDto.PostListingDataDto(
        after = after,
        children = children ?: throw Util.missingProperty("children", "children", reader),
        before = before
    )
  }

  public override fun toJson(writer: JsonWriter, value_: PostListingDto.PostListingDataDto?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("after")
    nullableStringAdapter.toJson(writer, value_.after)
    writer.name("children")
    listOfPostDtoAdapter.toJson(writer, value_.children)
    writer.name("before")
    nullableAnyAdapter.toJson(writer, value_.before)
    writer.endObject()
  }
}
