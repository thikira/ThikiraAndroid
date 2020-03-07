package com.dsm.api.response

import com.google.gson.annotations.SerializedName

data class MenuResponse(

    @SerializedName("menu_id")
    val menuId: Int,

    val name: String,

    val price: Int,

    val description: String,

    val image: String,

    val group: List<GroupItem>
)

data class GroupItem(

    @SerializedName("group_id")
    val groupId: Int,

    val name: String,

    @SerializedName("max_count")
    val maxCount: Int,

    val option: List<OptionItem>
)

data class OptionItem(

    @SerializedName("option_id")
    val optionId: Int,

    val name: String,

    val price: Int
)