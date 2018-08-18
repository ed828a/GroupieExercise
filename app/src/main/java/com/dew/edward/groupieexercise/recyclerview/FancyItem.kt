package com.dew.edward.groupieexercise.recyclerview

import android.support.annotation.ColorInt
import com.dew.edward.groupieexercise.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_number.*


/**
 *   Created by Edward on 8/18/2018.
 */
class FancyItem (@ColorInt private val color: Int,
                 private val number: Int)
    : Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.item_fancy_cardView.setCardBackgroundColor(color)
        viewHolder.item_fancy_number.text = number.toString()
    }

    override fun getLayout() = R.layout.item_number

    override fun getSpanSize(spanCount: Int, position: Int) = spanCount / COLUMN_NUMBER
}