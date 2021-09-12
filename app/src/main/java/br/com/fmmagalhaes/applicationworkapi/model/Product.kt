package br.com.fmmagalhaes.applicationworkapi.model

import com.google.gson.annotations.SerializedName

data class Product(
  @SerializedName("id")
  val id:String,
  @SerializedName("prname")
  val prname:String,
  @SerializedName("primage")
  val prImage:String,
  @SerializedName("prprice")
  val prPrice:String
)