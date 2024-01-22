package be.aminmousavi.fitnessapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MusclesApiService {
    @GET("photos")
    suspend fun getMuscles(): String
}

object MusclesApi {
    val retrofitService : MusclesApiService by lazy {
        retrofit.create(MusclesApiService::class.java)
    }
}