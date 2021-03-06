package com.movies.dytt.repositories

import com.movies.dytt.entities.Seed
import com.movies.dytt.entities.SeedList
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author donnieSky
 * @created_at 2018/8/24.
 * @description
 * @version
 */
@Singleton
class DyttRepository @Inject constructor(
        private val local: LocalDyttSource,
        private val remote: RemoteDyttSource
) {
    fun searchMovie(page: Int,
                    search: String): Flowable<SeedList<Seed>> {
        return remote.searchMovie(page, search)
    }

    fun getMovieList(categoryId: Int,
                     page: Int): Flowable<SeedList<Seed>> {
        return remote.getMovieList(categoryId, page)
    }
}