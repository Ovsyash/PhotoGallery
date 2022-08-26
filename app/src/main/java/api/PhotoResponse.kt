package api

import com.google.gson.annotations.SerializedName
import com.ovsyannikov.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}