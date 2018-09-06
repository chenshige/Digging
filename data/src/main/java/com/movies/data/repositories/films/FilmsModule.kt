package com.movies.data.repositories.films

import com.movies.inject.DOUBAN
import com.movies.inject.DYTT
import dagger.Binds
import dagger.Module

/**
 * @author donnieSky
 * @created_at 2018/9/6.
 * @description
 * @version
 */
@Module
abstract class FilmsModule {

    @Binds
    abstract fun bind(source: FilmRepositoryImpl): FilmRepository

    @Binds
    @DOUBAN
    abstract fun bind(source: DoubanFilmDataSource): FilmDataSource

    @Binds
    @DYTT
    abstract fun bind(source: DyttFilmDataSource): FilmDataSource

}