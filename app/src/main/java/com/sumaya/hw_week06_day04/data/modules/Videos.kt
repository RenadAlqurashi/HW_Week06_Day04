package com.sumaya.hw_week06_day04.data.modules

data class Videos (
	val id : Int,
	val name : String,
	val link : String,
	val imageUrl : String,
	val channel : Channel,
	val numberOfViews : Int
)