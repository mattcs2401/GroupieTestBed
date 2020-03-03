package com.mcssoft.groupietestbed.model

import com.mcssoft.groupietestbed.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.row_race_additional.*

class RaceExtrasProxy(private var raceExtras: RaceExtras) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.id_tv_runner_name.text = raceExtras.runnerName
        // TODO - the rest.
    }

    override fun getLayout(): Int = R.layout.row_race_additional
}