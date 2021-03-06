package com.movies.douqi.base

import androidx.lifecycle.ViewModelProvider
import com.movies.utils.Logger
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * @author donnieSky
 * @created_at 2018/8/24.
 * @description
 * @version
 */
abstract class BaseFragment : DaggerFragment() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    @Inject
    lateinit var logger: Logger

}