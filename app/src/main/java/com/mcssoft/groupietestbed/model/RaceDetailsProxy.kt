package com.mcssoft.groupietestbed.model

import com.mcssoft.groupietestbed.R
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.ExpandableItem
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.row_race.*

class RaceDetailsProxy(private var raceDetails: RaceDetails) : Item(), ExpandableItem {

    private lateinit var expandableGroup: ExpandableGroup

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.id_tv_city_code.text = raceDetails.cityCode
        viewHolder.id_tv_race_code.text = raceDetails.raceCode
        viewHolder.id_tv_race_no.text = raceDetails.raceNum
        viewHolder.id_tv_race_sel0.text = raceDetails.raceSel
        viewHolder.id_tv_race_time.text = raceDetails.raceTimeS

        // TODO - the rest.

        viewHolder.id_iv_exp_coll.setImageResource(getRotatedIconResId())

        viewHolder.id_cv_row_race.setOnClickListener {
            expandableGroup.onToggleExpanded()
            viewHolder.id_iv_exp_coll.setImageResource(getRotatedIconResId())
        }
    }

    override fun getLayout() = R.layout.row_race

    override fun setExpandableGroup(onToggleListener: ExpandableGroup) {
        expandableGroup = onToggleListener
    }

    private fun getRotatedIconResId() =
        if (expandableGroup.isExpanded)
            R.drawable.ic_keyboard_arrow_up_black_24dp
        else
            R.drawable.ic_keyboard_arrow_down_black_24dp
}