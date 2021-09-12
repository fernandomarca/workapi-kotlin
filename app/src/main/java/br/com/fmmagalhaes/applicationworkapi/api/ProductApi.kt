package br.com.fmmagalhaes.applicationworkapi.api

import br.com.fmmagalhaes.applicationworkapi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
  @GET("getdata.php")
  fun getProductApi(): Call<List<Product>>
}