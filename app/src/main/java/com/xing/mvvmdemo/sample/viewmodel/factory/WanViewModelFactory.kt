package com.xing.mvvmdemo.sample.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.xing.mvvmdemo.sample.WanUseCase
import com.xing.mvvmdemo.sample.viewmodel.BasicViewModel

/**
 *
 * @ProjectName: mvvmdemo
 * @Description: 作用描述 <todo>
 * @Author: xinxing.tao
 * @CreateDate: 2021/4/13 10:54
 * @UpdateUser: xinxing.tao
 * @UpdateDate: 2021/4/13 10:54
 * @UpdateRemark: 无
 */
class WanViewModelFactory(
    private val params: String? = null
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == BasicViewModel::class.java) {
            return BasicViewModel(params) as T
        }
        return super.create(modelClass)
    }
}