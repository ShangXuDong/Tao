package com.sxd.tao.manager

/***
 * 整个App，只有一个MainActivity。其他界面的实现没有使用Activity或者Fragment，而是通过在MainActivity上对View进行添加或者隐藏来实现。
 * 所以这里定义了View的一些状态。
 */
interface IStateView {
    fun onCreate()

    fun onRestart()

    fun onResume()

    fun onStop()

    fun onDestory()
}