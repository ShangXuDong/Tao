package com.sxd.tao.manager

import com.sxd.tao.constant.ViewConstant

interface IViewManager {
    /**
     * 切换View，需要判断要切换的View是否已经存在
     */
    fun changeView(newView : ViewConstant)
}