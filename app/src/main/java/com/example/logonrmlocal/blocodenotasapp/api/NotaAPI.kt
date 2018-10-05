package com.example.logonrmlocal.blocodenotasapp.api

import com.example.logonrmlocal.blocodenotasapp.model.Nota
import retrofit2.Call
import retrofit2.http.*


interface NotaAPI {

    @GET("/nota")
    fun buscarTodos(): Call<List<Nota>>

    @GET("/nota/titulo/{titulo}")
    fun buscaPorTitulo(@Path("titulo") titulo: String): Call<List<Nota>>

    @POST("/nota")
    fun salvar(@Body nota: Nota): Call<Nota>

    @DELETE("/nota/{id}")
    fun apagar(@Path("id") id: String): Call<Void>
}