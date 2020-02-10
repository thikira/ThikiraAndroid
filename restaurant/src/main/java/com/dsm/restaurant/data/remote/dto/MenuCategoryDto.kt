package com.dsm.restaurant.data.remote.dto

import com.dsm.restaurant.data.local.dto.MenuCategoryLocalDto
import com.google.gson.annotations.SerializedName

data class MenuCategoryDto(

    @SerializedName("menu_category_id")
    val menuCategoryId: Int,

    val name: String
) {

    fun toLocalDto() = MenuCategoryLocalDto(
        menuCategoryId = menuCategoryId,
        name = name
    )
}