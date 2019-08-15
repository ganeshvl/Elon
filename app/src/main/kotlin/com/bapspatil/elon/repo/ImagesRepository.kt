package com.bapspatil.elon.repo

import com.bapspatil.elon.api.model.NasaItem
import io.reactivex.Single

/*
** Created by Bapusaheb Patil {@link https://bapspatil.com}
*/

interface ImagesRepository {
    fun getImagesFromApi(query: String?, mediaType: String?, yearStart: Int?, yearEnd: Int?): Single<ArrayList<NasaItem>>
}