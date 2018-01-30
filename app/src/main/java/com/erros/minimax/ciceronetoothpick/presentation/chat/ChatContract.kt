package com.erros.minimax.ciceronetoothpick.presentation.chat

import com.erros.minimax.ciceronetoothpick.presentation.base.BasePresenter
import com.erros.minimax.ciceronetoothpick.presentation.base.BaseView

/**
 * Created by milkman on 30.01.18.
 */
interface ChatContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {
        fun onBackPressed()
    }

}