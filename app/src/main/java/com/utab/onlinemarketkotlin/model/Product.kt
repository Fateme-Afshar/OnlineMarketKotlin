package com.utab.onlinemarketkotlin.model

import com.google.gson.annotations.SerializedName

data class Product(
		@field:SerializedName("id")
		var id: String = "",
		@field:SerializedName("name")
		var name: String = "",
		@field:SerializedName("description")
		var description: String = "",
		@field:SerializedName("price")
		var price:String="",
		@field:SerializedName("regular_price")
		var regular_price:String=""
)
