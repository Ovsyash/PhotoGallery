package api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=192ece85fd45d7a6d613f891b8cd3d62" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos() : Call<FlickrResponse>


    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}

